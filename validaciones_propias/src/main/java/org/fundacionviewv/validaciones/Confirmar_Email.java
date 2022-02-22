package org.fundacionviewv.validaciones;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ TYPE, METHOD })
@Constraint(validatedBy = Confirmar_Email_Valid.class)
public @interface Confirmar_Email {

	public String message() default "Las direcciones de correo deben coincidir";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
	
	
}
