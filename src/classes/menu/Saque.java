package classes.menu;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import classes.menu.Cadastro;



@ManagedBean
public class Saque {

	Cadastro cadastro = new Cadastro();
	public int numAge;
	public int numConta;
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

	public double saque;
	
	public boolean saque(double pValor){
		 pValor = getSaque();
		
		 if (this.saldo <= pValor) {
			double novoSaldo = this.saldo - pValor;
			this.saldo = novoSaldo;
			return true;
		}
		 else if (this.saldo > pValor) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Saldo Insuficiente!"));
			 return false;
		}
		return false;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	      
	      
	     

}

