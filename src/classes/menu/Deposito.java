package classes.menu;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import classes.menu.Cadastro;

@ManagedBean
public class Deposito {

	public int numAge;
	public int numConta;
	public double deposito;
	Cadastro cadastro = new Cadastro();
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

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposito(double pValor) {
		pValor = getSaldo();
		this.saldo += pValor;
		pValor = getSaldo();
	}

	public void gravar() {

		try {
			FileOutputStream arquivo = new FileOutputStream(
					"C:\\Users\\e803823\\Documents\\Menu-master\\Arquivos\\dados.txt",
					true);
			PrintWriter pr = new PrintWriter(arquivo);

			pr.print("AGENCIA:" + numAge + "\n");
			pr.print("CONTA:" + numConta + "\n");
			pr.print("DEPOSITO:" + deposito + "\n");

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

	public void cancelarDeposito() {
		addMessage("Mensagegem", "Depósito Cancelado.");
	}
	public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
