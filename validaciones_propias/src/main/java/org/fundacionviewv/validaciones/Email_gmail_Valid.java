package org.fundacionviewv.validaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Email_gmail_Valid implements ConstraintValidator<Email_gmail, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value.contains("@gmail.com")) {
			
			return true;
		}else
		// TODO Auto-generated method stub
		return false;
	}

}
