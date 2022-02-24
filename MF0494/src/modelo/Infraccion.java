package modelo;

import java.util.Objects;

public class Infraccion {
	String dni;
	String nombre;
	String apellidos;
	int antiguedad;
	float sancion;
	int puntos;
	public Infraccion(String dni, String nombre, String apellidos, int antiguedad, float sancion, int puntos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.antiguedad = antiguedad;
		this.sancion = sancion;
		this.puntos = puntos;
	}
	public Infraccion() {
		super();
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public float getSancion() {
		return sancion;
	}
	public void setSancion(float sancion) {
		this.sancion = sancion;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Infraccion other = (Infraccion) obj;
		return Objects.equals(dni, other.dni);
	}
	@Override
	public String toString() {
		return "Infraccion [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", antiguedad="
				+ antiguedad + ", sancion=" + sancion + ", puntos=" + puntos + "]";
	}
	

}
