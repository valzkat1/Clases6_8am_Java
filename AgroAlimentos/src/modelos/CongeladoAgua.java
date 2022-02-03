package modelos;

public class CongeladoAgua extends ProductoCongelado{

	private double porcentaSalinidad;

	public double getPorcentaSalinidad() {
		return porcentaSalinidad;
	}

	public void setPorcentaSalinidad(double porcentaSalinidad) {
		this.porcentaSalinidad = porcentaSalinidad;
	}

	public CongeladoAgua() {
		super();
	}

	@Override
	public String toString() {
		return "CongeladoAgua [porcentaSalinidad=" + porcentaSalinidad + ", fechaCaducidad=" + fechaCaducidad
				+ ", lote=" + lote + ", paisOrigen=" + paisOrigen + ", fechaEnvasado=" + fechaEnvasado
				+ ", getPorcentaSalinidad()=" + getPorcentaSalinidad() + ", getTemperaturaMante()="
				+ getTemperaturaMante() + ", getFechaCaducidad()=" + getFechaCaducidad() + ", getLote()=" + getLote()
				+ ", getPaisOrigen()=" + getPaisOrigen() + ", getFechaEnvasado()=" + getFechaEnvasado()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
