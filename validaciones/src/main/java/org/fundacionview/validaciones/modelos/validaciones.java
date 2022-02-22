package org.fundacionview.validaciones.modelos;

import java.math.BigDecimal;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Component
public class validaciones {

	@AssertTrue(message = "Debes aceptar terminos y condiciones del servicio")
	private boolean esVerdadero;
	
	@DecimalMax(value = "10000",message = "Maximo 10000")
	@NotNull
	private BigDecimal maximoDecimal;

	@Email(message = "Solo direcciones de correo validas")
	@NotBlank(message = "Campo Requerido")
	private String Email;
	
	@Min(value = 10,message = "Solo mayores de 10 años")
	@Max(value = 100,message = "Solo menores de 100")
	private int edad;
	
	@Size(min = 5,max = 10,message = "Minimo 5 y maximo 10 caracteres")
	private String tamano;
	
	
	@NotEmpty(message = "No puede estar vacio")
	private String[] noVacio;
	
	@NotNull(message = "Campo requerido")
	private String noNulo;
	
	
	// dd/MM/yy  o dd/MM/yyyy
	//@Pattern(regexp = "(\\d{2})/(\\d{2})/((\\d{2})|(\\d{4}))",message = "Solo formatos como : dd/MM/yy  o dd/MM/yyyy")
	@Pattern(regexp = "([0-9]{2})/([0-9]{2})/(([0-9]{2})|([0-9]{4}))",message = "Solo formatos como : (dd/MM/yy)  o (dd/MM/yyyy)")
	private String expReg1;
	
	
	//  +57-300xxxxxxxx
	@Pattern(regexp = "^(\\+57)-([0-9]{10})",message = "Solo numeros con indicativo de colombia (+57-)")
	private String expReg2;
	
	
	// @gmail.com
	@Pattern(regexp = "(\\w{3,})(@gmail.com)$",message = "Solo direcciones de correo de gmail")
	private String expReg3;
	
	
	// 192.168.0.1  dir ip
	@Pattern(regexp = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})")
	private String expReg4;
	
	
	public String getExpReg4() {
		return expReg4;
	}

	public void setExpReg4(String expReg4) {
		this.expReg4 = expReg4;
	}

	public String getExpReg3() {
		return expReg3;
	}

	public void setExpReg3(String expReg3) {
		this.expReg3 = expReg3;
	}

	public String getExpReg2() {
		return expReg2;
	}

	public void setExpReg2(String expReg2) {
		this.expReg2 = expReg2;
	}

	public String getExpReg1() {
		return expReg1;
	}

	public void setExpReg1(String expReg1) {
		this.expReg1 = expReg1;
	}

	public String getNoNulo() {
		return noNulo;
	}

	public void setNoNulo(String noNulo) {
		this.noNulo = noNulo;
	}

	public String[] getNoVacio() {
		return noVacio;
	}

	public void setNoVacio(String[] noVacio) {
		this.noVacio = noVacio;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public validaciones() {
		super();
	}
	
	public boolean isEsVerdadero() {
		return esVerdadero;
	}

	public void setEsVerdadero(boolean esVerdadero) {
		this.esVerdadero = esVerdadero;
	}

	public BigDecimal getMaximoDecimal() {
		return maximoDecimal;
	}

	public void setMaximoDecimal(BigDecimal maximoDecimal) {
		this.maximoDecimal = maximoDecimal;
	}
	
	
	
	
	
	
}
