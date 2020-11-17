package model;

public class Entrenador {
	
	private int colegiado;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Entrenador(int colegiado, String nombre, String apellidos, int edad) {
		this.colegiado = colegiado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public int getNumero() {
		return colegiado;
	}

	public void setNumero(int colegiado) {
		this.colegiado = colegiado;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Entrenador [colegiado=" + colegiado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad="
				+ edad + "]";
	}
	

}
