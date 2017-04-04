package org.primefaces.showcase.view.menu;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
@ManagedBean
public class MensagemCadastro {
 
    
	public void sim() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Mensagem de confirmação:","Cadastro realizado com sucesso!"));
    }
     
    public void nao() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning!", "Cadastramento não realizado!"));
    }

}