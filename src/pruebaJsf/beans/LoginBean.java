package pruebaJsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import lombok.Data;

@ManagedBean
@Data
public class LoginBean {
	
	@ManagedProperty(value = "#{messageBean}")
	private MessageBean messageBean;
	
	@ManagedProperty(value = "#{sessionBean}")
	private SessionBean sessionBean;
	
	private String usuario;
	
	private String pass;
	
	public String ingresar() {
		System.out.println("Ingresar Usuario " + usuario + " Pass " + pass);
		if(this.usuario.contentEquals("carlos")) {
		
			messageBean.setMessage("Bienvenido El usuario es " + usuario);
			sessionBean.setUsuario(usuario);
			return "home";
			
		}else {
			messageBean.setMessage("Error El usuario " + usuario + " es invalido" );
			sessionBean.setUsuario(null);
			return "error";
			
		}
		//
	}
	
	public void validar() {
		System.out.println("Validar Usuario " + usuario + " Pass " + pass);
	}
	
}
