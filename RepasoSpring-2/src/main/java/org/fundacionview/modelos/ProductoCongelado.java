package org.fundacionview.modelos;

import org.springframework.stereotype.Component;

@Component
public class ProductoCongelado extends Producto{

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
