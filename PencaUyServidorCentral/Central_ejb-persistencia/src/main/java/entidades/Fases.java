package entidades;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Fases
 *
 */
@Entity

public class Fases implements Serializable {

	   
	@Id
	private int id;
	private String nombre;
	private Torneos torneoId;
	private static final long serialVersionUID = 1L;

	public Fases() {
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
	public Torneos getTorneoId() {
		return this.torneoId;
	}

	public void setTorneoId(Torneos torneoId) {
		this.torneoId = torneoId;
	}
   
}
