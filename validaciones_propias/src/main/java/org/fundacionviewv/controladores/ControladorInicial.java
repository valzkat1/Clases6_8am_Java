package org.fundacionviewv.controladores;

import javax.validation.Valid;

import org.fundacionviewv.modelos.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorInicial {

	@GetMapping("/")
	public String index(Model mod) {
		mod.addAttribute("usuario",new Usuario());
		return "index";
	}
	
	@PostMapping("/validar")
	public String validar(@Valid @ModelAttribute("usuario")Usuario us,BindingResult resv) {
		
		if(resv.hasErrors()) {
			
			return "index";
		}else {
		
		return "resultados";
		}
	}
	
}
