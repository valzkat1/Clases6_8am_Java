package org.fundacionview.controladores;

import org.fundacionview.modelos.ProductoCongelado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorDos {
	
	
	@Autowired
	ProductoCongelado pc2;
	
	@GetMapping("/contenedor")
	public String home(Model mod) {
		
		mod.addAttribute("producto",pc2);
		return "index2";
	}
	

}
