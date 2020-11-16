package model;

public class Jugador {
	
	private int numero;
	private String nombre;
	private String apellido;
	private String nick;
	private int puntos;
	
	public Jugador(int numero, String nombre, String apellido, String nick, int puntos) {
		
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nick = nick;
		this.puntos = puntos;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", nombre=" + nombre + ", apellido=" + apellido + ", nick=" + nick
				+ ", puntos=" + puntos + "]";
	}
	
	


}
