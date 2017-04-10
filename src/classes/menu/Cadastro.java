package classes.menu;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;




@ManagedBean (name = "cadastro")
public class Cadastro {
	public String nome;
	public int numAge;
	public String numConta;
	public String agencia = ""; 
	public String conta = "";
	public String  Asaldo = "";
	public String  Anome = "";
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAsaldo() {
		return Asaldo;
	}

	public void setAsaldo(String asaldo) {
		Asaldo = asaldo;
	}

	public String getAnome() {
		return Anome;
	}

	public void setAnome(String anome) {
		Anome = anome;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
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
	
	public int getNumAge() {
		return numAge;
	}

	public void gravar() {
		
		try {
			FileOutputStream arquivo = new FileOutputStream("C:\\Users\\e803823\\Documents\\Menu-master\\Arquivos\\dados.txt", true);
			PrintWriter pr = new PrintWriter(arquivo);
			
			    pr.print("AGENCIA:" + numAge + "\n");
			    pr.print("CONTA:" + numConta + "\n");
			    pr.print("SALDO:" + saldo + "\n");
			    pr.println("NOME:" + nome);
		 pr.close();
		 arquivo.close();
		} catch (Exception e) {
			System.out.println("Erro escrever arquivo");
		}
		
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Mensagem de confirmação:","Gravado com sucesso!"));
		
	}
	
	public void ler() throws FileNotFoundException{
		Scanner sc = new Scanner(new File("C:\\Users\\e803823\\Documents\\Menu-master\\Arquivos\\dados.txt"));
		while(sc.hasNextLine()){
			agencia = sc.nextLine();
			conta = sc.nextLine();
			Anome = sc.nextLine();
			Asaldo = sc.nextLine();
		}
		sc.close();
		
	}
	
	public void cancelarCadasto() {
		addMessage("Mensagegem", "Cadastro Cancelado.");
	}
	public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
		
}
