package org.fundacionview.controladores;

import org.fundacionview.modelos.ProductoCongelado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorUno {

	@Autowired
	ProductoCongelado pc2;
	
	
	@GetMapping("/")
	public String index(Model mod) {
		
		//ProductoCongelado pc1=new ProductoCongelado();
		pc2.setLote("1231244");
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
