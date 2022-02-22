package org.fundacionview.validar.validaciones;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = FechaPasada_Valid.class)
public @interface FechaPasada {

	public String message() default "Fecha invalida";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
 	
	
}
