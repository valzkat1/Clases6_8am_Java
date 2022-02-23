package org.fundacionview.proyectoweb.controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fundacionview.proyectoweb.modelos.InfoBasica;
import org.fundacionview.proyectoweb.modelos.InfoLogin;
import org.fundacionview.proyectoweb.modelos.Usuario;
import org.fundacionview.proyectoweb.repositorios.Repo_Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorInicial {
	
	@Autowired
	Repo_Usuarios misUs;
	
	@GetMapping("/")
	public String index(Model mod,HttpServletRequest soli) {
		
		HttpSession sessi=soli.getSession();
		if(sessi.getAttribute("USERNAME")!=null) {
			return "menu";
		}else {
		mod.addAttribute("usuario",new Usuario());
		return "index";
		}
	}
	

	@PostMapping("/login")
	public String logeo(@Validated({InfoLogin.class}) @ModelAttribute("usuario")Usuario us,BindingResult rv,HttpServletRequest solici) {
		
		if(rv.hasErrors()) {
			return "index";
		}else {
			if(us.getUsername().equals("victor") && us.getClave().equals("123456")) {
				
				HttpSession session=solici.getSession();
				session.setAttribute("USERNAME", us.getUsername());
				return "redirect:/menu";
			}else {
				return "index";
			}
		}
		
	}
	
	@GetMapping("/menu")
	public String menu(HttpServletRequest soli,Model mod) {
		
		HttpSession sessi=soli.getSession();
		if(sessi.getAttribute("USERNAME")!=null) {
			mod.addAttribute("listaUser",misUs.findAll());
			return "home";
		}else {
		
		return "redirect:/";
		}
		
	}
	
	
	@GetMapping("/crear")
	public String crearUser(HttpServletRequest soli,Model mod) {
		
		HttpSession sessi=soli.getSession();
		if(sessi.getAttribute("USERNAME")!=null) {
			mod.addAttribute("usuario",new Usuario());
			return "crear";
		}else {
		
		return "redirect:/";
		}
		
		
	}
	
	
	@PostMapping("/crearUs")
	public String crearU(@Validated({InfoBasica.class}) @ModelAttribute("usuario")Usuario us,BindingResult rv,HttpServletRequest solici) {
		
		if(rv.hasErrors()) {
			return "crear";
		}else {
			
				misUs.save(us);
				return "redirect:/menu";
			
		}
		
	}
	
	
}
