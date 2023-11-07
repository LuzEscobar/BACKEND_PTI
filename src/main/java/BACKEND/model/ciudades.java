package BACKEND.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "ciudades")
public class ciudades {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	
	@ManyToOne
	@JoinColumn (name="id_departamento")
	private departamentos departamentos;

	
	public ciudades(String nombre, BACKEND.model.departamentos departamentos) {
		super();
		this.nombre = nombre;
		this.departamentos = departamentos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public departamentos getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(departamentos departamentos) {
		this.departamentos = departamentos;
	}
	
	
}
