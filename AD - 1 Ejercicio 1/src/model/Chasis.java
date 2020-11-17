package model;

import java.io.Serializable;

public class Chasis implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Integer Bastidor;
	public String Material;
	public Double Precio;
	

	
	
	public Integer getBastidor() {
		return Bastidor;
	}



	public void setBastidor(Integer bastidor) {
		Bastidor = bastidor;
	}



	public String getMaterial() {
		return Material;
	}



	public void setMaterial(String material) {
		Material = material;
	}



	public Double getPrecio() {
		return Precio;
	}



	public void setPrecio(Double precio) {
		Precio = precio;
	}



	public Chasis(Integer bastidor, String material, Double precio) {
		super();
		Bastidor = bastidor;
		Material = material;
		Precio = precio;
	}
	
	
	
	@Override
	public String toString() {
		return "Chasis [Bastidor=" + Bastidor + ", Material=" + Material + ", Precio=" + Precio + "]";
	}

	
	
	
	
	
	

}
