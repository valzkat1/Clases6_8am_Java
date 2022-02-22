package org.fundacionviewv.validaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Indicativo_Colombia_Valid implements ConstraintValidator<Indicativo_Colombia, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if(value.startsWith("57")) {
			return true;
		}else
		// TODO Auto-generated method stub
		return false;
	}

}
