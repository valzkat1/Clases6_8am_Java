package org.fundacionview.html.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorUno {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

}
