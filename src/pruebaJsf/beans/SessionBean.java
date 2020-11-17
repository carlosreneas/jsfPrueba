package pruebaJsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import lombok.Data;

@ManagedBean
@SessionScoped
@Data
public class SessionBean {
	private String usuario;
}
