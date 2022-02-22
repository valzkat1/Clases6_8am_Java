package org.fundacionviewv.validaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = Email_gmail_Valid.class)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Email_gmail {
 
	public String message() default "Solo direcciones de correo de gmail";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
	
}
