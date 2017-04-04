package classes.menu;

import javax.faces.bean.ManagedBean;



@ManagedBean
public class Cadastro {
	public String nome;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double saldo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
