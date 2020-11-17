package model;

import java.io.Serializable;
import java.util.List;

public class Coche implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Integer id;
	public String Marca;
	public List<Chasis> chasis;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public List<Chasis> getChasis() {
		return chasis;
	}
	public void setChasis(List<Chasis> chasis) {
		this.chasis = chasis;
	}
	
	
	
	@Override
	public String toString() {
		return "Coche [id=" + id + ", Marca=" + Marca + ", chasis=" + chasis + "]";
	}
	
	
	
	public Coche(Integer id, String marca, List<Chasis> chasis) {
		
		this.id = id;
		Marca = marca;
		this.chasis = chasis;
	}
	
	
	

}
