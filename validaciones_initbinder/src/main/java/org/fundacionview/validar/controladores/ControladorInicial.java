package org.fundacionview.validar.controladores;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.fundacionview.validar.modelos.InformacionLogin;
import org.fundacionview.validar.modelos.Usuario;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorInicial {

	
	@InitBinder
	public void allowEmptyDateBinding( WebDataBinder binder )
	{ 
	    // tell spring to set empty values as null instead of empty string.
	    binder.registerCustomEditor( String.class, new StringTrimmerEditor( true ));
	    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
	    simpleDateFormat.setLenient(false);
	    binder.registerCustomEditor( Date.class, new CustomDateEditor( simpleDateFormat,false));	   
	}
	
	@GetMapping("/")
	public String index(Model mod) {
		mod.addAttribute("usuario",new Usuario());
		return "index";
	}
	
	@PostMapping("/validar")
	public String validar(@Valid @ModelAttribute("usuario")Usuario us,BindingResult resultaV) {
		
		if(resultaV.hasErrors()) {
			return "index";
		}else {
		 return "resultados";
		}
	}
	
	
	@GetMapping("/login")
	public String login(Model mod) {
		mod.addAttribute("usuario",new Usuario());
		return "login";
	}
	
	@PostMapping("/validar2")
	public String validar2(@Validated({InformacionLogin.class}) @ModelAttribute("usuario")Usuario us,BindingResult resultaV) {
		
		if(resultaV.hasErrors()) {
			return "login";
		}else {
		 return "resultados";
		}
	}
	
}
