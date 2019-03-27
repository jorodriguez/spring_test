package mx.proyecttest.my.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.proyecttest.my.model.Usuario;
import mx.proyecttest.my.service.UsuarioService;

@Named
public class UsuarioBean {

	private List<Usuario> lista;
	private Usuario usuario;
	

	@Autowired
	private UsuarioService usuarioService;
	
	@PostConstruct
	private void init() {
		System.out.println("Iniciando  ");		
		obtenerUsuarios();
		usuario = new Usuario();		
	}
	private void obtenerUsuarios() {
		this.lista = usuarioService.obtenerUsuarios();
	}
	
	public void guardarUsuario(ActionEvent e) {
		usuarioService.guardar(usuario);
		obtenerUsuarios();
		usuario = new Usuario();
	}
		
	public void eliminar(ActionEvent e) {
		Integer idUsuario = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id_usuario"));		 
		usuarioService.eliminar(idUsuario);
		obtenerUsuarios();
	}
	
	public List<Usuario> getLista(){
		return lista;
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
