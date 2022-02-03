package modelos;

public class Medico extends Persona{

	private int precioConsulta;
	private String especialidad;
	

	
	
	public Medico() {
		super();
	}
	public int getPrecioConsulta() {
		return precioConsulta;
	}
	public void setPrecioConsulta(int precioConsulta) {
		this.precioConsulta = precioConsulta;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	
	
}
