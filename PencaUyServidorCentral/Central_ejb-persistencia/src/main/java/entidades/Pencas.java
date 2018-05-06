package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pencas
 *
 */
@Entity

public class Pencas implements Serializable {

	   
	@Id
	private int id;
	private Organizaciones organizacionId;
	private static final long serialVersionUID = 1L;

	public Pencas() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Organizaciones getOrganizacionId() {
		return this.organizacionId;
	}

	public void setOrganizacionId(Organizaciones organizacionId) {
		this.organizacionId = organizacionId;
	}
   
}
