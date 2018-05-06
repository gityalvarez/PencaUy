package entidades;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Grupos
 *
 */
@Entity

public class Grupos implements Serializable {

	   
	@Id
	private int id;
	private String nombre;
	private Fases faseId;
	private static final long serialVersionUID = 1L;

	public Grupos() {
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
	public Fases getFaseId() {
		return this.faseId;
	}

	public void setFaseId(Fases faseId) {
		this.faseId = faseId;
	}
   
}
