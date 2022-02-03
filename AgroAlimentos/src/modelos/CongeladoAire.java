package modelos;

public class CongeladoAire extends ProductoCongelado{

	private double CantOxigeno;
	private double CantDioxido;
	private double CantNitrogeno;
	private double CantVapor;
	
	public CongeladoAire() {
		super();
	}
	
	public double getCantOxigeno() {
		return CantOxigeno;
	}
	public void setCantOxigeno(double cantOxigeno) {
		CantOxigeno = cantOxigeno;
	}
	public double getCantDioxido() {
		return CantDioxido;
	}
	public void setCantDioxido(double cantDioxido) {
		CantDioxido = cantDioxido;
	}
	public double getCantNitrogeno() {
		return CantNitrogeno;
	}
	public void setCantNitrogeno(double cantNitrogeno) {
		CantNitrogeno = cantNitrogeno;
	}
	public double getCantVapor() {
		return CantVapor;
	}
	public void setCantVapor(double cantVapor) {
		CantVapor = cantVapor;
	}

	@Override
	public String toString() {
		return "CongeladoAire [CantOxigeno=" + CantOxigeno + ", CantDioxido=" + CantDioxido + ", CantNitrogeno="
				+ CantNitrogeno + ", CantVapor=" + CantVapor + ", fechaCaducidad=" + fechaCaducidad + ", lote=" + lote
				+ ", paisOrigen=" + paisOrigen + ", fechaEnvasado=" + fechaEnvasado + ", getCantOxigeno()="
				+ getCantOxigeno() + ", getCantDioxido()=" + getCantDioxido() + ", getCantNitrogeno()="
				+ getCantNitrogeno() + ", getCantVapor()=" + getCantVapor() + ", getTemperaturaMante()="
				+ getTemperaturaMante() + ", getFechaCaducidad()=" + getFechaCaducidad() + ", getLote()=" + getLote()
				+ ", getPaisOrigen()=" + getPaisOrigen() + ", getFechaEnvasado()=" + getFechaEnvasado()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
