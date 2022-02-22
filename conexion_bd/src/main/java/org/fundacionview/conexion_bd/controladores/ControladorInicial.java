package org.fundacionview.conexion_bd.controladores;

import javax.validation.Valid;

import org.fundacionview.conexion_bd.modelos.Usuarios;
import org.fundacionview.conexion_bd.repositorios.Repo_Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorInicial {

	@Autowired
	Repo_Usuarios repoU;
	
	@GetMapping("/")
	public String index(Model mod) {
	 mod.addAttribute("usuarios",new Usuarios());
		return "index";
	}
	
	@PostMapping("/guardarUsuario")
	public String guardarUsuario(@Valid @ModelAttribute("usuarios")Usuarios us,Model mod,BindingResult resv) {
	
		if(resv.hasErrors()) {
			return "index";
		}else {
			repoU.save(us);
			return "redirect:/ok";
		}
		
	}
	
	@GetMapping("/ok")
	public String ok() {
		return "ok";
	}
	
	@GetMapping("/lista")
	public String listar(Model mod) {
		
		mod.addAttribute("listaUser",repoU.findAll());
		return "lista";
	}
	
	@GetMapping("/editar")
	public String editar(Model mod,@RequestParam("id")int id) {
		
		mod.addAttribute("usuarios",repoU.getById(id));
		return "editar";
	}
	
	
	@GetMapping("/eliminar")
	public String eliminar(Model mod,@RequestParam("id")int id) {
		
		repoU.deleteById(id);
		
		return "redirect:/lista";
	}
	
}
