package model;

public class Entrenador {
	
	private int colegiado;
	private String nombre;
	
	
	public Entrenador(int colegiado, String nombre) {
		super();
		this.colegiado = colegiado;
		this.nombre = nombre;
	}


	public int getColegiado() {
		return colegiado;
	}


	public void setColegiado(int colegiado) {
		this.colegiado = colegiado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Entrenador [colegiado=" + colegiado + ", nombre=" + nombre + "]";
	}
	
	
	
	

}
