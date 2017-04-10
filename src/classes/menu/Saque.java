package classes.menu;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import classes.menu.Cadastro;
import classes.menu.Deposito;

@ManagedBean
public class Saque {

	Cadastro cadastro = new Cadastro();
	Deposito deposito = new Deposito();
	public int numAge;
	public int numConta;
	public double saque;
	// public double saldoA(){
	// return Double.parseDouble(cadastro.getAsaldo());
	// }
	public double saldo = cadastro.getSaldo();

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumAge() {
		return numAge;
	}

	public void setNumAge(int numAge) {
		this.numAge = numAge;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean saque(double pValor) {
		pValor = getSaque();

		if (this.saldo <= pValor) {
			double novoSaldo = this.saldo - pValor;
			this.saldo = novoSaldo;
			novoSaldo = getSaldo();
			return true;
		} else if (this.saldo > pValor) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!",
							"Saldo Insuficiente!"));
			return false;
		}

		boolean consegui = saque(getSaque());
		if (consegui) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info!",
							"Operação com sucesso!"));
		} else
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!",
							"Erro na operação!"));
		return false;
	}

	public void gravar() {

		try {
			FileOutputStream arquivo = new FileOutputStream("C:\\Users\\e803823\\Documents\\Menu-master\\Arquivos\\dados.txt",true);
			PrintWriter pr = new PrintWriter(arquivo);

			pr.print("AGENCIA:" + numAge + "\n");
			pr.print("CONTA:" + numConta + "\n");
			pr.print("SALDO:" + saque + "\n");

			pr.close();
			arquivo.close();
		} catch (Exception e) {
			System.out.println("Erro escrever arquivo");
		}

		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Mensagem de confirmação:", "Gravado com sucesso!"));

	}

	public void cancelarSaque() {
		addMessage("Mensagegem", "Saque Cancelado.");
	}

	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}
