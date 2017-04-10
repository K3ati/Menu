package org.primefaces.showcase.view.menu;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
@ManagedBean
public class MensagemDeposito {
 
    
	public void sim() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Mensagem de confirma��o:","Deposito realizado com sucesso!"));
    }
     
    public void nao() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning!", "Deposito n�o realizado!"));
    }

}