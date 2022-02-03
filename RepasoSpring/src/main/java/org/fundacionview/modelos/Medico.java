package org.fundacionview.modelos;

public class Medico extends Persona{

	@Override
	public String toString() {
		return "Medico [precioConsulta=" + precioConsulta + ", especialidad=" + especialidad + ", nombre=" + nombre
				+ ", edad=" + edad + ", RUT=" + RUT + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura
				+ ", getPrecioConsulta()=" + getPrecioConsulta() + ", getEspecialidad()=" + getEspecialidad()
				+ ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getRUT()=" + getRUT()
				+ ", getSexo()=" + getSexo() + ", getPeso()=" + getPeso() + ", getAltura()=" + getAltura()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
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
