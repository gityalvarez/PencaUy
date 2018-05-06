package entidades;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Organizaciones
 *
 */
@Entity

public class Organizaciones implements Serializable {

	   
	@Id
	private int id;
	private String nombre;
	private static final long serialVersionUID = 1L;

	public Organizaciones() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
}
