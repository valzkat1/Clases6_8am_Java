package org.fundacionview.proyectoweb.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Usuario {

	@Id
	private int cc;	
	@Size(min = 2,max = 100,message = "Campo requerido",groups = InfoBasica.class)
	private String nombre;
	
	@Size(min = 2,max = 100,message = "Campo requerido",groups = InfoBasica.class)
	private String apellidos;
	@Min(value = 18,groups = InfoBasica.class)
	private int edad;
	@Email(message = "",groups = InfoBasica.class)
	@NotBlank(message = "",groups = InfoBasica.class)
	private String email;
	
	
	@NotBlank(message = "Campo Requerido",groups = InfoLogin.class)
	private String username;
	@NotBlank(message = "Campo Requerido",groups = InfoLogin.class)
	private String clave;
	
	
	private String lenguaje;
	public String getLenguaje() {
		return lenguaje;
	}


	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	private String pais;
	
	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public Usuario() {
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}

	
	
	
	
	
	
	
}
