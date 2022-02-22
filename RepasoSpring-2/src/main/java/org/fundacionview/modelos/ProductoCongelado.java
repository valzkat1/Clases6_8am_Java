package org.fundacionview.modelos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ProductoCongelado extends Producto{

	@Override
	public String toString() {
		return "ProductoCongelado [temperaturaMante=" + temperaturaMante + ", fechaCaducidad=" + fechaCaducidad
				+ ", lote=" + lote + ", paisOrigen=" + paisOrigen + ", fechaEnvasado=" + fechaEnvasado
				+ ", getTemperaturaMante()=" + getTemperaturaMante() + ", getFechaCaducidad()=" + getFechaCaducidad()
				+ ", getLote()=" + getLote() + ", getPaisOrigen()=" + getPaisOrigen() + ", getFechaEnvasado()="
				+ getFechaEnvasado() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	private double temperaturaMante;

	public double getTemperaturaMante() {
		return temperaturaMante;
	}

	public void setTemperaturaMante(double temperaturaMante) {
		this.temperaturaMante = temperaturaMante;
	}

	public ProductoCongelado() {
		super();
	}
	
	
	
	
}
