package classes.menu;

import javax.faces.bean.ManagedBean;
import classes.menu.*;


@ManagedBean
public class Saque {

	public int numAge;
	public int numConta;
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
	
	public 
	 /*public boolean saque (double pValor){
	        this.saldo = Lab01Sistema.getSaldo();
	        pValor = Lab01Sistema.getSaque();
	        
	        if(this.saldo <= pValor){
	            double novoSaldo = this.saldo - pValor;
	            this.saldo = novoSaldo;
	            return true;
	        }
	         else if(this.saldo > pValor){
	             System.out.println("Saldo insuficiente");
	             return false;
	        }
	        return false;
	    }
	   
	      public void deposito (double pValor){
	          pValor = Lab01Sistema.getDeposito();
	          
	          this.saldo += pValor;
	      }
	      
	      
	      public void imprimir (){ 
	           System.out.println("Agencia: " + this.numAge);
	           System.out.println("\nConta: " + this.numConta);
	           System.out.println("\nNome: " + this.nome);
	           System.out.println("\nSaldo: " + this.saldo);
	         
	      }*/

}

