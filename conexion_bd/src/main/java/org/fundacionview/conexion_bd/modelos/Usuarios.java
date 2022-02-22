package org.fundacionview.conexion_bd.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity(name = "tbl_usuarios")
public class Usuarios {

	@Id
	private int cc;	
	@Size(min = 2,max = 100,message = "Campo requerido")
	private String nombre;
	@Column(name = "lastnames")
	private String apellidos;
	private int edad;
	private String email;
	
	
	public Usuarios() {
		super();
	}
	
	public int getCc() {
		return cc;
	}


	public void setCc(int cc) {
		this.cc = cc;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
