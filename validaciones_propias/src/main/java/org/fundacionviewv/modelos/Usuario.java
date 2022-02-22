package org.fundacionviewv.modelos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.fundacionviewv.validaciones.Confirmar_Email;
import org.fundacionviewv.validaciones.Email_gmail;
import org.fundacionviewv.validaciones.Indicativo_Colombia;
import org.springframework.stereotype.Component;

@Component
@Confirmar_Email
public class Usuario {

	
	@NotBlank(message = "Campo Requerido")
	@Size(min = 1,max = 100,message = "El nombre es requerido")
	private String nombre;
	
	@Size(min = 3,max = 100,message = "El apellido es requerido")
	private String apellidos;
	
	//  (Cll Cr) (1 y 3 digitos) # 1-3 (-) 1-3
	@Pattern(regexp = "^((Cll)|(Cr)) (\\d{1,3}) # (\\d{1,3})-(\\d{1,3})",message = "Formato direccion: Cr 35 # 82-16")
	private String direccion;
	
	@Min(value = 18,message = "Solo mayores de 18")
	private int edad;
	
	@Email_gmail
	private String email;
	
	
	private String confirmaremail;
	
	
	public String getConfirmaremail() {
		return confirmaremail;
	}


	public void setConfirmaremail(String confirmaremail) {
		this.confirmaremail = confirmaremail;
	}
	@Indicativo_Colombia
	private String telefono;
	
	
	
	
	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	private String username;
	private String clave;
	
	
	
	public Usuario() {
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
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
