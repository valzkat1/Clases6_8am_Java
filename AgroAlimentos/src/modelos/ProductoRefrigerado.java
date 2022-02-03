package modelos;

public class ProductoRefrigerado extends Producto{

	private String codigoSuperviAlim;
	private double temperaMante;
	
	public ProductoRefrigerado() {
		super();
	}
	
	
	
	
	public ProductoRefrigerado(String fechaCaducidad, String lote, String paisOrigen, String fechaEnvasado) {
		super(fechaCaducidad, lote, paisOrigen, fechaEnvasado);
		// TODO Auto-generated constructor stub
	}




	public String getCodigoSuperviAlim() {
		return codigoSuperviAlim;
	}
	public void setCodigoSuperviAlim(String codigoSuperviAlim) {
		this.codigoSuperviAlim = codigoSuperviAlim;
	}
	public double getTemperaMante() {
		return temperaMante;
	}
	public void setTemperaMante(double temperaMante) {
		this.temperaMante = temperaMante;
	}

	@Override
	public String toString() {
		return "ProductoRefrigerado [codigoSuperviAlim=" + codigoSuperviAlim + ", temperaMante=" + temperaMante
				+ ", fechaCaducidad=" + fechaCaducidad + ", lote=" + lote + ", paisOrigen=" + paisOrigen
				+ ", fechaEnvasado=" + fechaEnvasado + ", getCodigoSuperviAlim()=" + getCodigoSuperviAlim()
				+ ", getTemperaMante()=" + getTemperaMante() + ", getFechaCaducidad()=" + getFechaCaducidad()
				+ ", getLote()=" + getLote() + ", getPaisOrigen()=" + getPaisOrigen() + ", getFechaEnvasado()="
				+ getFechaEnvasado() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
