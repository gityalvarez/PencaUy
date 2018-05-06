package entidades;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Torneos
 *
 */
@Entity

public class Torneos implements Serializable {

	   
	@Id
	private int id;
	private String nombre;
	private String tipo;
	private Date comienzo;
	private static final long serialVersionUID = 1L;

	public Torneos() {
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
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}   
	public Date getComienzo() {
		return this.comienzo;
	}

	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}
   
}
