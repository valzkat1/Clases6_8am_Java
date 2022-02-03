package org.fundacionview.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorUno {

	
	@GetMapping("/")
	public String index(Model mod) {
		
		mod.addAttribute("variable","Esto lo controla java");
		return "index";
		// /vistas/ index .jsp
	}
	
	@GetMapping("/home")
	public String index2() {
		
		
		return "index2";
		// /vistas/ index .jsp
	}
	
	
}
