package modelos;

public class Paciente extends Persona{

	private String fechaPrimeraConsulta;
	
	private Medico medicoTratante;

	
	public Paciente() {
		super();
	}

	public String getFechaPrimeraConsulta() {
		return fechaPrimeraConsulta;
	}

	public void setFechaPrimeraConsulta(String fechaPrimeraConsulta) {
		this.fechaPrimeraConsulta = fechaPrimeraConsulta;
	}

	public Medico getMedicoTratante() {
		return medicoTratante;
	}

	public void setMedicoTratante(Medico medicoTratante) {
		this.medicoTratante = medicoTratante;
	}
	
	
	public int calcularIMC() {
		double pesoIdeal=(peso/Math.pow(altura,2));
		int retorno;
		
		if(pesoIdeal<18.5) {
			retorno=-1;
		}else if(pesoIdeal>=18.5 && pesoIdeal<=24.9) {
			retorno=0;
		}else {
			retorno=1;
		}
		
		return retorno;
	}
	
	public boolean esMayorDeEdad() {
		if(edad>=18) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean comprobarSexo() {
		if(sexo.equalsIgnoreCase("h")|| sexo.equalsIgnoreCase("m")) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean comprobarSexo2(String sexo) {
		if(sexo.equalsIgnoreCase("h")|| sexo.equalsIgnoreCase("m")) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Paciente [fechaPrimeraConsulta=" + fechaPrimeraConsulta + ", medicoTratante=" + medicoTratante
				+ ", nombre=" + nombre + ", edad=" + edad + ", RUT=" + RUT + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + ", getFechaPrimeraConsulta()=" + getFechaPrimeraConsulta()
				+ ", getMedicoTratante()=" + getMedicoTratante() + ", esMayorDeEdad()=" + esMayorDeEdad()
				+ ", comprobarSexo()=" + comprobarSexo() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getRUT()=" + getRUT() + ", getSexo()=" + getSexo() + ", getPeso()=" + getPeso() + ", getAltura()="
				+ getAltura() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
