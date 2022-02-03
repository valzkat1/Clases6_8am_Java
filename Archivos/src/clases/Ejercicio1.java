package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;


/*Realiza un programa en JAVA en el que muestre un menu que te permita 3
opciones:
1. Creacion de un fichero de texto (con el nombre que tu quieras) en el que indiques en
cada linea:
Tu Nombre.
Tus Apellidos.
Tu Ciudad de Nacimiento.
2. Mostrar por pantalla el contenido del fichero de texto creado.
3. Salir del Programa.*/


public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File 
		//FileWriter
		//FileReader
		Menu();
		
		
	}
	
	
	public static void Menu() {
		
		int opcion=0;
		
	while (opcion!=3) {
		
		
	
		opcion=ReglasNegocio.SolicitarEntero("Por favor seleccion una opcion: \n"+
											 "1. Crear Archivo \n"+
											 "2. Leer Archivo \n"+
											 "3. Salir");
		
		switch (opcion) {
		case 1: 
			CrearArchivo();
			break ;
		case 2: 
			MostrarInfoArchivo();
			break ;
		case 3: 
			
			break ;	
		default:
			
			break;
		}
		
		
	}
	}
	
	public static void CrearArchivo() {
		
		FileWriter escri=null;
		
		try {
			escri=new FileWriter("Documento.txt");
			PrintWriter pw = new PrintWriter(escri);
			EscribirArchivo(pw);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(escri!=null) {
					escri.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
	}
	
	public static void EscribirArchivo(PrintWriter pw) {
		
		String nombre,apellidos,ciudad;
		nombre=JOptionPane.showInputDialog("Por favor ingrese el nombre");
		apellidos=JOptionPane.showInputDialog("Por favor ingrese los apellidos");
		ciudad= JOptionPane.showInputDialog("Por favor ingrese la Ciudad de nacimiento");
		
		
		pw.println("Nombre: "+nombre);
		pw.println("Apellidos: "+apellidos);
		pw.println("Ciudad nacimiento: "+ciudad);
		
	}
	
	
	public static void MostrarInfoArchivo() {
		FileReader lector=null;
		File documen=new File("Documento.txt");
		try {
			lector =new FileReader(documen);
			
			BufferedReader buffer=new BufferedReader(lector);
			LeerArchivo(buffer);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void LeerArchivo(BufferedReader buf) {
		String linea=null;
		try {
			
			linea = buf.readLine();
			while (linea!=null) {
				System.out.println(linea);
				linea= buf.readLine();
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
