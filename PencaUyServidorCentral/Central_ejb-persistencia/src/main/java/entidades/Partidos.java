package entidades;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Partidos
 *
 */
@Entity

public class Partidos implements Serializable {

	   
	@Id
	private int id;
	private Grupos grupoId;
	private Equipos equipoLocalId;
	private Equipos equipoVisitaId;
	private int golesEquipoLocal;
	private int golesEquipoVisita;
	private Date fecha;
	private Equipos equipoGanadorId;
	private String estado;
	private static final long serialVersionUID = 1L;

	public Partidos() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Grupos getGrupoId() {
		return this.grupoId;
	}

	public void setGrupoId(Grupos grupoId) {
		this.grupoId = grupoId;
	}   
	public Equipos getEquipoLocalId() {
		return this.equipoLocalId;
	}

	public void setEquipoLocalId(Equipos equipoLocalId) {
		this.equipoLocalId = equipoLocalId;
	}   
	public Equipos getEquipoVisitaId() {
		return this.equipoVisitaId;
	}

	public void setEquipoVisitaId(Equipos equipoVisitaId) {
		this.equipoVisitaId = equipoVisitaId;
	}   
	public int getGolesEquipoLocal() {
		return this.golesEquipoLocal;
	}

	public void setGolesEquipoLocal(int golesEquipoLocal) {
		this.golesEquipoLocal = golesEquipoLocal;
	}   
	public int getGolesEquipoVisita() {
		return this.golesEquipoVisita;
	}

	public void setGolesEquipoVisita(int golesEquipoVisita) {
		this.golesEquipoVisita = golesEquipoVisita;
	}   
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}   
	public Equipos getEquipoGanadorId() {
		return this.equipoGanadorId;
	}

	public void setEquipoGanadorId(Equipos equipoGanadorId) {
		this.equipoGanadorId = equipoGanadorId;
	}   
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
   
}
