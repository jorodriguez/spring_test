package mx.proyecttest.my.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.proyecttest.my.dao.UsuarioRepository;
import mx.proyecttest.my.model.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario obtenerUsuario(String nombre) {				
		
		return usuarioRepository.findByNombre(nombre);
	}
	
	public List<Usuario> obtenerUsuarios() {				
		
		return usuarioRepository.findAll();
	}
	
	
	public void guardar(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public void eliminar(Integer idUsuario) {
		usuarioRepository.deleteById(idUsuario);
	}
	
}
