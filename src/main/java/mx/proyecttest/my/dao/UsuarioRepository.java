package mx.proyecttest.my.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.proyecttest.my.model.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Integer>{

	//@Autowired
	//private JdbcTemplate jdbcTemplate;
	
	//El metodo no tiene implementacion debido  a que se implementa solo por el framwwork por la convencion del nombre
		public Usuario findByNombre(String nombre); 
	
}
