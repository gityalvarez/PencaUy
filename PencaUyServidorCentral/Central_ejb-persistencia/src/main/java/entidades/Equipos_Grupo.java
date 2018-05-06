package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Equipos_Grupo
 *
 */
@Entity

public class Equipos_Grupo implements Serializable {

	   
	@Id
	private int id;
	private Equipos equipoId;
	private Grupos grupoId;
	private int partidosJugados;
	private int partidosGanados;
	private int partidosPerdidos;
	private int partidosEmpatados;
	private int golesFavor;
	private int golesContra;
	private int puntos;
	private int posicion;
	private static final long serialVersionUID = 1L;

	public Equipos_Grupo() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Equipos getEquipoId() {
		return this.equipoId;
	}

	public void setEquipoId(Equipos equipoId) {
		this.equipoId = equipoId;
	}   
	public Grupos getGrupoId() {
		return this.grupoId;
	}

	public void setGrupoId(Grupos grupoId) {
		this.grupoId = grupoId;
	}   
	public int getPartidosJugados() {
		return this.partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}   
	public int getPartidosGanados() {
		return this.partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}   
	public int getPartidosPerdidos() {
		return this.partidosPerdidos;
	}

	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}   
	public int getPartidosEmpatados() {
		return this.partidosEmpatados;
	}

	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}   
	public int getGolesFavor() {
		return this.golesFavor;
	}

	public void setGolesFavor(int golesFavor) {
		this.golesFavor = golesFavor;
	}   
	public int getGolesContra() {
		return this.golesContra;
	}

	public void setGolesContra(int golesContra) {
		this.golesContra = golesContra;
	}   
	public int getPuntos() {
		return this.puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}   
	public int getPosicion() {
		return this.posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
   
}
