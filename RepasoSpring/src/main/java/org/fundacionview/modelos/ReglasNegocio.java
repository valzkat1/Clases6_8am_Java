package org.fundacionview.modelos;

import javax.swing.JOptionPane;

public class ReglasNegocio {

	public ReglasNegocio() {
		super();
	} 
	
	public static int ConvertirEntero(String cadena) {
		int resultado=0;
		try {
			resultado=Integer.parseInt(cadena);
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
		return resultado;
	}
	
	public int SolicitarEntero(String mensaje) {
		int respuest=0;
		while(respuest<1) {
			respuest=ConvertirEntero(JOptionPane.showInputDialog(mensaje));
		}
		return respuest;
		
	}
	
	
	public static double ConvertirReal(String cadena) {
		double resulta=0.0;
		try {
			resulta=Double.parseDouble(cadena);
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
		return resulta;
		
	}
	
	public double SolicitarReal(String mensaje) {
		double retorno=0.0;
		while(retorno<1) {
			retorno = ConvertirReal(JOptionPane.showInputDialog(mensaje));
		}
		return retorno;
		
	}
	
	public String SolicitarSexo() {
		String resulta="";
		boolean correcto=false;
		while(!correcto) {
			resulta=JOptionPane.showInputDialog("Por favor ingrese el sexo del paciente");
			correcto=Paciente.comprobarSexo2(resulta);
		}
		return resulta;
		
	}
	
	
}
