package classes.menu;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;




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
	
	public void gravar() throws IOException {
		FileWriter arq = new FileWriter("C:\\Users\\e803823\\Documents\\Menu\\Arquivos\\dados.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		
		gravarArq.printf("%d", getNumAge());
	
		arq.close();
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Mensagem de confirmação:","Gravado com sucesso!"));
		
	}
	
	
	public void ler() throws IOException {
		FileReader arq = new FileReader("C:\\Users\\e803823\\Documents\\Menu\\Arquivos\\dados.txt");
		BufferedReader lerarq = new BufferedReader(arq);
		
		int linha = lerarq.read();
		
		while (linha!= 0) {
			linha = getNumAge();
			linha = lerarq.read();
		}
		
		arq.close();	
	}
	
	public int getNumAge() {
		return numAge;
	}
	
}
