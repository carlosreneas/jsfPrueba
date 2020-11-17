package pruebaJsf.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import co.edu.ufps.sistemajpa.dao.UsuarioDao;
import co.edu.ufps.sistemajpa.entidades.Usuario;
import lombok.Data;

@ManagedBean
@Data
public class LoginBean {
	
	@ManagedProperty(value = "#{messageBean}")
	private MessageBean messageBean;
	
	@ManagedProperty(value = "#{sessionBean}")
	private SessionBean sessionBean;
	
	private String usuario;
	
	private List<Usuario> usuarios;
	
	private String pass;
	
	public String ingresar() {
		System.out.println("Ingresar Usuario " + usuario + " Pass " + pass);
		if(this.usuario.contentEquals("carlos")) {
		
			messageBean.setMessage("Bienvenido El usuario es " + usuario);
			sessionBean.setUsuario(usuario);
			return "exito";
			
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
	
	public List<Usuario> getUsuarios() {
		UsuarioDao uDao = new UsuarioDao();
		return uDao.list();
	}
	
	
	
}
