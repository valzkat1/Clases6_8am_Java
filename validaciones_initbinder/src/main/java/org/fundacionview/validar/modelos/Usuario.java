package org.fundacionview.validar.modelos;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.fundacionview.validar.validaciones.FechaPasada;
import org.fundacionview.validar.validaciones.ValidarEdad;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;


@Component
@ValidarEdad(groups = InformacionBasica.class)
public class Usuario {

	
	@Size(min = 4,message = "Minimo 4 caracteres",groups = InformacionLogin.class)
	@NotNull(groups = InformacionLogin.class)
	private String username;
	@Size(min = 4,message = "Minimo 4 caracteres",groups = InformacionLogin.class)
	@NotNull(groups = InformacionLogin.class)
	private String clave;
	
	
	@Size(min = 4,message = "Minimo 4 caracteres",groups = InformacionBasica.class)
	@NotNull(groups = InformacionBasica.class)
	private String nombre;
	@NotNull(groups = InformacionBasica.class)
	private String apellidos;

	
	private int edad;
	
	@NotNull(groups = InformacionBasica.class)
	@FechaPasada(groups = InformacionBasica.class)
	private Date fechaNacimiento;
	
	
	public Usuario() {
		super();
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
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
	
	
}
