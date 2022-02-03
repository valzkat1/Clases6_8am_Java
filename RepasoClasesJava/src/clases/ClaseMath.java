package clases;

import java.lang.Math;

import javax.swing.JOptionPane;

public class ClaseMath {

	//Ambito de las variables
	//Global, Local y Static
	
	public static int aleatorioRango(int fin,int ini) {
		return (int) (Math.random()*fin + ini);
	}
	
	public static int lanzarDado() {
		
		
		return (int) (Math.random()*6 + 1);
	}
	
	public static void main(String[] args) {
		
		int dado1= lanzarDado();
		int dado2= lanzarDado();
		
		if(dado1>dado2) {
			System.out.println("El dado1 es mayor : "+dado1+"  "+dado2);
		}else if(dado2>dado1){
			System.out.println("El dado2 es mayor : "+dado1+"  "+dado2);

		}else {
			System.out.println("Tienen el mismo resultado : "+dado1+"  ");

		}
		int x=0;
		System.out.println("El resultado de la funcion evaluada en "+x+" es: "+evaluarFuncionEnX(x) );
		System.out.println("El resultado de la funcion evaluada en V2 "+x+" es: "+evaluarFuncionEnX_2(x) );

		
		boolean compara=compararCadenas_Sin_CaseSensitive("Texto1", "texto1");
		System.out.println("Resultado Comparacion "+compara);
		
		
		//System.out.println("La cadena sin espacion es: "+(( JOptionPane.showInputDialog("Ingrese el texto"))));
		System.out.println("Resultado contiene: "+contiene("El texto cualquiera","text"));
		
		System.out.println("Resultado contienePosi: "+contienePosi("El texto cualquiera","textr"));

		System.out.println("Resultado ComienzaCon: "+comienzaEn("El texto cualquiera","El"));

		
	}
	
	public static double evaluarFuncionEnX(int x) {
		
		double Rsen,Rcos,Rraiz,potX3,fraccion,eulePotx3,seisPI,tanEux3;
		
		potX3    	 = Math.pow(x, 3);
		fraccion	 = 2*x/9;
		eulePotx3 	 = Math.pow(Math.E,potX3);
		seisPI		 = 6*Math.PI;
		tanEux3      = Math.tan(eulePotx3);
		Rsen		 = Math.sin(potX3+fraccion);
		Rcos 		 = Math.cos(seisPI + tanEux3);
		Rraiz 		 = Math.sqrt(Rsen + Rcos);
		return Rraiz;
	}
	
	public static double evaluarFuncionEnX_2(int x) {
		
		return Math.sqrt(Math.sin(Math.pow(x,3)+ 2*x/9)+(Math.cos(6*Math.PI + Math.tan(Math.pow(Math.E,Math.pow(x, 3))))));
	}
	
	
	
	public static boolean compararCadenas(String cadena1,String cadena2) {
		
		if(cadena1.equals(cadena2)) {
			return true;
		}else {
			return false;
		}
		
	}
	
public static boolean compararCadenas_Sin_CaseSensitive(String cadena1,String cadena2) {
		
		if(cadena1.equalsIgnoreCase(cadena2)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
public static String EliminarEspacios(String entrada) {
	return entrada.trim();
}


public static boolean contiene(String cadena,String contenido) {
	return cadena.contains(contenido);
}


public static int contienePosi(String cadena,String contenido) {
	return cadena.indexOf(contenido);
}

public static boolean comienzaEn(String cadena,String contenido) {
	return cadena.startsWith(contenido);
}

}
