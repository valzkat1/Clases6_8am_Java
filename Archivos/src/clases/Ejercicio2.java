package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*Crea un fichero de texto, en el Bloc de Notas, con el nombre y contenido
que tú quieras. Ahora crea una aplicación en JAVA que lea este fichero de
texto (¡OJO! Carácter a carácter, no línea a línea) y muestre su
contenido por pantalla sin espacios.
• Por ejemplo, si un fichero contiene el texto “Esto es una prueba”, deberá mostrar por
pantalla “Estoesunaprueba”.
 */

public class Ejercicio2 {

	
	public static void main(String[] args) {
		MostrarArchivo();
	}
	
	
	public static void MostrarArchivo() {
		FileReader lector=null;
		File archivo= new File("Lectura.txt");
		try {
			lector=new FileReader(archivo);
			BufferedReader buffer= new BufferedReader(lector);
			LeerBuffer2(buffer);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void LeerBuffer(BufferedReader buf) {
		int caracter;
		String letra;
		
		try {
			caracter=buf.read();
			while(caracter!=-1) {
				
				letra= (char)caracter+"";
				
				if(letra.equals(" ")) {
					
				}else {
				
				System.out.print((char)caracter);
				}
				caracter=buf.read();
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
 	
	
	public static void LeerBuffer2(BufferedReader buf) {
		int caracter;
		String letra;
		
		try {
			caracter=buf.read();
			while(caracter!=-1) {
				
				letra= (char)caracter+"";
				
			
				letra=letra.trim();
				System.out.print(letra);
				
				caracter=buf.read();
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
 	
	
	
}
