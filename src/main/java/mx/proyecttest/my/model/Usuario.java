package mx.proyecttest.my.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario", catalog = "public")
public class Usuario {
		private Integer id;
		private String nombre;
		private Integer edad;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id", unique = true, nullable = false)
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		@Column(name = "nombre", nullable = true, length = 200)
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		@Column(name = "edad")
		public Integer getEdad() {
			return edad;
		}
		public void setEdad(Integer edad) {
			this.edad = edad;
		}
}
