package org.fundacionview.formularios.controladores;

import javax.servlet.http.HttpServletRequest;

import org.fundacionview.formularios.modelos.Fomulario;
import org.fundacionview.formularios.modelos.etiquetas_from_mvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorUno {

	@Autowired
	Fomulario fom;
	
	@GetMapping("/")
	public String index(Model mod) {	
				
		mod.addAttribute("formu",new Fomulario());
		return "index";
	}
	
	
	@PostMapping("/formulario")
	public String formulario(Model mod, @RequestParam("nombre")String nombre,
							@RequestParam("apellidos")String apellidos,
							@RequestParam("edad")int edad) {
		
		fom.setNombre(nombre);
		fom.setApellidos(apellidos);
		fom.setEdad(edad);
		
		mod.addAttribute("formulario",fom);
		return "resultado";
	}
	
	
	@PostMapping("/formulario2")
	public String formulario2(Model mod, HttpServletRequest solicitud) {
		
		fom.setNombre(solicitud.getParameter("nombre"));
		fom.setApellidos(solicitud.getParameter("apellidos"));
		fom.setEdad(Integer.parseInt( solicitud.getParameter("edad")));
		
		mod.addAttribute("formulario",fom);
		return "resultado";
	}
	
	
	@PostMapping("/formulario3")
	public String formulario3(Model mod,@ModelAttribute("formulario")Fomulario fom) {
		
		mod.addAttribute("formulario",fom);
		return "resultado";
	}
	
	@GetMapping("/etiquetas")
	public String etiquetas(Model mod) {
		
		mod.addAttribute("etiquetas_from_mvc",new etiquetas_from_mvc());
		return "etiquetas";
	}
	
	@PostMapping("/etiquetas")
	public String formularioEtiquetas(Model mod,@ModelAttribute("etiquetas_from_mvc")etiquetas_from_mvc fom) {
		
		mod.addAttribute("formulario",fom);
		return "resultado";
	}
	
	
}
