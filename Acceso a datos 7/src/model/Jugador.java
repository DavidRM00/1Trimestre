package model;

public class Jugador {
	private int numero;
	private String nombre;
	private String Apellidos;
	private String nick;
	private int puntos;
	
	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", nombre=" + nombre + ", Apellidos=" + Apellidos + ", nick=" + nick
				+ ", puntos=" + puntos + "]";
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

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
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

	public Jugador(String nombre, String apellidos, String nick, int puntos) {
		
		this.numero = numero;
		this.nombre = nombre;
		this.Apellidos = apellidos;
		this.nick = nick;
		this.puntos = puntos;
	}
}
