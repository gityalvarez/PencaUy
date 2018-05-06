package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Premios
 *
 */
@Entity

public class Premios implements Serializable {

	   
	@Id
	private int id;
	private int total;
	private TiposPremio tipoPremioId;
	private int puesto1;
	private int puesto2;
	private static final long serialVersionUID = 1L;

	public Premios() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}   
	public TiposPremio getTipoPremioId() {
		return this.tipoPremioId;
	}

	public void setTipoPremioId(TiposPremio tipoPremioId) {
		this.tipoPremioId = tipoPremioId;
	}   
	public int getPuesto1() {
		return this.puesto1;
	}

	public void setPuesto1(int puesto1) {
		this.puesto1 = puesto1;
	}   
	public int getPuesto2() {
		return this.puesto2;
	}

	public void setPuesto2(int puesto2) {
		this.puesto2 = puesto2;
	}
   
}
