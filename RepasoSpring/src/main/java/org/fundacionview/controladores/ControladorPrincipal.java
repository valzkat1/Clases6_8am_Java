package org.fundacionview.controladores;

import javax.print.attribute.standard.Media;
import javax.servlet.http.HttpServletRequest;

import org.fundacionview.modelos.Medico;
import org.fundacionview.modelos.Paciente;
import org.fundacionview.modelos.ReglasNegocio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorPrincipal {

	// toda Url  o link en la barra del explorador realiza una peticion GET
	
	// GET   POST
	
	@GetMapping("/")
	public String index(Model mod) {
		
		
		mod.addAttribute("mensaje", "Esta informacion se envia desde java");
		return "index";
	}
	
	@PostMapping("/procesar_paciente")
	public String procesarPaciente(Model mod,HttpServletRequest formulario) {
		
		Medico miMedi=new Medico();
		Paciente miPaci= new Paciente();
		
		miMedi.setNombre("Andres");
		miMedi.setEdad(40);
		miMedi.setAltura(1.7);
		miMedi.setEspecialidad("Nutricion");
		miMedi.setPrecioConsulta(120000);
		
		miPaci.setNombre(formulario.getParameter("nombre"));
		miPaci.setEdad(ReglasNegocio.ConvertirEntero(formulario.getParameter("nombre")));
		miPaci.setAltura(ReglasNegocio.ConvertirReal(formulario.getParameter("altura")));
		miPaci.setPeso(ReglasNegocio.ConvertirEntero(formulario.getParameter("peso")));
		miPaci.setSexo(formulario.getParameter("sexo"));
		miPaci.setFechaPrimeraConsulta(formulario.getParameter("fecha"));
		
		miPaci.setMedicoTratante(miMedi);
		
		mod.addAttribute("medico",miMedi);
		mod.addAttribute("paciente",miPaci);
		return "resultado";
	}
	
	
	@GetMapping("/otrapagina")
	public String otrapagina() {
		
		return "otrapagina";
	}
	
}
