package org.fundacionview.validaciones.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

import org.fundacionview.validaciones.modelos.validaciones;

@Controller
public class ControladorInicial {
	
	
	
	@GetMapping("/")
	public String index(Model mod) {
		
		mod.addAttribute("validaciones",new validaciones());
		return "index";
	}

	@PostMapping("/validaciones")
	public String validaciones(@Valid @ModelAttribute("validaciones")validaciones val,BindingResult resultaVali) {
		if(resultaVali.hasErrors()) {
			return "index";
		}else {
		
		return "redirect:/resultado";
		}
	}
	
	@GetMapping("/resultado")
	public String resultado() {
		return "resultados";
	}
	
}
