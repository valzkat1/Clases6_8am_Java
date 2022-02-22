package org.fundacionviewv.validaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.fundacionviewv.modelos.Usuario;

public class Confirmar_Email_Valid implements ConstraintValidator<Confirmar_Email, Usuario>{

	@Override
	public boolean isValid(Usuario value, ConstraintValidatorContext context) {
	
		if(value.getEmail().equals(value.getConfirmaremail())) {
			return true;
		}else {
	
			context.buildConstraintViolationWithTemplate("La direcciones de correo deben coincidir").addNode("confirmaremail").addConstraintViolation();
			
		return false;
		}
	}

}
