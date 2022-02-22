package org.fundacionview.validar.validaciones;

import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FechaPasada_Valid  implements ConstraintValidator<FechaPasada, Date>{

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(value!=null) {
			
			if(value.before(new Date())) {
				return true;
			}else {
				return false;
			}
			
			
		}else
		
		return false;
	}

}
