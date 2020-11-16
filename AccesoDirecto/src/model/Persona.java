package model;

public class Persona {
	
	private String nombre;
	private int edad;
	private double altura;
	
	
	public Persona(String nombre, int edad, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "principal [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + ", getAltura()=" + getAltura() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	

}
