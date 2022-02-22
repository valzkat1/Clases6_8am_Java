package org.fundacionview.formularios.modelos;

import org.springframework.stereotype.Component;

@Component
public class Fomulario {

	private String nombre;
	private String apellidos;
	private int edad;
	
	
	
	@Override
	public String toString() {
		return "Fomulario [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", getNombre()="
				+ getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Fomulario() {
		super();
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
	
	
	
}
