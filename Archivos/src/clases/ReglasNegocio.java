package clases;

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
	
	public static int SolicitarEntero(String mensaje) {
		int respuest=0;
		while(respuest<1) {
			respuest=ConvertirEntero(JOptionPane.showInputDialog(mensaje));
		}
		return respuest;
		
	}
	
	
	public double ConvertirReal(String cadena) {
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
	

	
	
}
