package entidades;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Participantes
 *
 */
@Entity

public class Participantes implements Serializable {

	   
	@Id
	private int id;
	private String usuario;
	private Pencas pencaId;
	private int puntos;
	private static final long serialVersionUID = 1L;

	public Participantes() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}   
	public Pencas getPencaId() {
		return this.pencaId;
	}

	public void setPencaId(Pencas pencaId) {
		this.pencaId = pencaId;
	}   
	public int getPuntos() {
		return this.puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
   
}
