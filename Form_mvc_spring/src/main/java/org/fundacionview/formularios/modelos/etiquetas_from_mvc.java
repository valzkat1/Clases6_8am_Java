package org.fundacionview.formularios.modelos;

import org.springframework.stereotype.Component;

@Component
public class etiquetas_from_mvc {

	private String nombre;
	private String sexo;
	private String habilidades;
	private String password;
	
	private String seleccion;
	private String textoLargo;
	
	
	
	public String getSeleccion() {
		return seleccion;
	}
	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}
	public String getTextoLargo() {
		return textoLargo;
	}
	public void setTextoLargo(String textoLargo) {
		this.textoLargo = textoLargo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	@Override
	public String toString() {
		return "etiquetas_from_mvc [nombre=" + nombre + ", sexo=" + sexo + ", habilidades=" + habilidades
				+ ", getNombre()=" + getNombre() + ", getSexo()=" + getSexo() + ", getHabilidades()=" + getHabilidades()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public etiquetas_from_mvc() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}
	
	
	
	
	
	
}
