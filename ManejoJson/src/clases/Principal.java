package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MostrarArchivo();
		
	}

	public static void MostrarArchivo() {
		FileReader lector=null;
		File archivo= new File("LecturaJSON.txt");
		try {
			lector=new FileReader(archivo);
			BufferedReader buffer= new BufferedReader(lector);
			LeerBufferJson(lector);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void LeerBufferJson(FileReader buf) {
		JSONParser parser= new JSONParser();
		try {
			Object objDocumento =parser.parse(buf);
			
			//java Cast
			JSONObject MiJsonOBJ= (JSONObject)objDocumento;
			
			String departa = (String) MiJsonOBJ.get("departamento");
			String nombDepar=(String) MiJsonOBJ.get("nombredepto");
			String director = (String) MiJsonOBJ.get("director");
			
			System.out.println("Departamento: "+departa);
			System.out.println("Nombre Dep: "+nombDepar);
			System.out.println("Director: "+director);
			
			
			
			JSONArray empleados = (JSONArray) MiJsonOBJ.get("empleados");
			
			Iterator<JSONObject> iteraciones= empleados.iterator();
			
			while(iteraciones.hasNext()) {
				
				JSONObject emplead=iteraciones.next();
				System.out.println("Nomb Empl: "+emplead.get("nombre"));
				System.out.println(emplead);
				
				
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	
}
