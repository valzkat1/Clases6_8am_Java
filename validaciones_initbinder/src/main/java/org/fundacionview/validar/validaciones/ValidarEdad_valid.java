package org.fundacionview.validar.validaciones;

import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.fundacionview.validar.modelos.Usuario;

public class ValidarEdad_valid implements ConstraintValidator<ValidarEdad, Usuario>{

	@Override
	public boolean isValid(Usuario value, ConstraintValidatorContext context) {
		
		if(value.getEdad()!=0 && value.getFechaNacimiento()!=null) {
			
			Date naci=value.getFechaNacimiento();
			if((new Date().getYear()-naci.getYear())>=value.getEdad()) {
				return true;
			}else {
				mostrarError(context);
				return false;
			}
			
		}else {
		// TODO Auto-generated method stub
			mostrarError(context);
		return false;
		}
	}

	public void mostrarError(ConstraintValidatorContext context) {
		
		context.buildConstraintViolationWithTemplate("La edad no coincide con la fecha de nacimiento").addNode("edad").addConstraintViolation();
		
	}
	
}
