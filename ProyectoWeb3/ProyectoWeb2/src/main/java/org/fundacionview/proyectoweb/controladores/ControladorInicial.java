package org.fundacionview.proyectoweb.controladores;

import java.io.File;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fundacionview.proyectoweb.modelos.InfoBasica;
import org.fundacionview.proyectoweb.modelos.InfoLogin;
import org.fundacionview.proyectoweb.modelos.Usuario;
import org.fundacionview.proyectoweb.repositorios.Repo_Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ControladorInicial {
	
	@Autowired
	Repo_Usuarios misUs;
	
	
	@Autowired
	MessageSource misMensajes;
	
	
	@GetMapping("/")
	public String index(Model mod,HttpServletRequest soli) {
		
		HttpSession sessi=soli.getSession();
		if(sessi.getAttribute("USERNAME")!=null) {
			return "redirect:/menu";
		}else {
		mod.addAttribute("usuario",new Usuario());
		
		Locale usa=new Locale("en","US");
		
		String txtUser=misMensajes.getMessage("usuarios.textousername",null, usa);
		String txtclave=misMensajes.getMessage("usuarios.textoclave",null, usa);

		mod.addAttribute("txtUser",txtUser);
		mod.addAttribute("txtclave",txtclave);
		return "index";
		}
	}
	

	@PostMapping("/login")
	public String logeo(@Validated({InfoLogin.class}) @ModelAttribute("usuario")Usuario us,BindingResult rv,HttpServletRequest solici) {
		
		if(rv.hasErrors()) {
			return "index";
		}else {
			
			Usuario rL=misUs.getLogin(us.getUsername(), us.getClave());
			if(rL!=null) {
			//if(us.getUsername().equals("victor") && us.getClave().equals("123456")) {
				
				HttpSession session=solici.getSession();
				session.setAttribute("USERNAME", us.getUsername());
				return "redirect:/menu";
			}else {
				return "index";
			}
		}
		
	}
	
	@GetMapping("/menu")
	public String menu(HttpSession soli,Model mod) {
		
		//HttpSession sessi=soli.getSession();
		if(soli.getAttribute("USERNAME")!=null) {
			mod.addAttribute("listaUser",misUs.findAll());
			return "home";
		}else {
		
		return "redirect:/";
		}
		
	}
	
	
	@GetMapping("/crear")
	public String crearUser(HttpSession soli,Model mod) {
		
		//HttpSession sessi=soli.getSession();
		if(soli.getAttribute("USERNAME")!=null) {
			mod.addAttribute("usuario",new Usuario());
			return "crear";
		}else {
		
		return "redirect:/";
		}
		
		
	}
	
	
	@PostMapping("/crearUs")
	public String crearU(@Validated({InfoBasica.class,InfoLogin.class}) @ModelAttribute("usuario")Usuario us,BindingResult rv,HttpServletRequest solici,@RequestParam("archivo")MultipartFile archivo,Model mod) {
		
		if(rv.hasErrors()) {
			return "crear";
		}else {
			
			String nombreArchiv=archivo.getOriginalFilename();
			try {
				archivo.transferTo(new File("/home/master/Documents/Workspace-6_8am/ProyectoWeb2/"+nombreArchiv));
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			us.setApellidos(nombreArchiv);
			
			Usuario uCC=misUs.getById(us.getCc());
			if(uCC!=null) {
				mod.addAttribute("msg","La cedula ya esta registrada");
				return "crear";
			}else {
				misUs.save(us);
				return "redirect:/menu";
			}
			
		}
		
	}
	
	@GetMapping("/listar")
	public String listarU(Model mod,HttpSession ses) {
		
		if(ses.getAttribute("USERNAME")!=null) {
			mod.addAttribute("listaUser",misUs.findAll());
			return "home";
		}else {
		
		return "redirect:/";
		}
		
	}
	
	@GetMapping("/editar")
	public String editar(HttpSession ses,Model mod,@RequestParam("id")int id) {
		
		if(ses.getAttribute("USERNAME")!=null) {
			mod.addAttribute("usuario",misUs.getById(id));
			return "editar";
		}else {
		
		return "redirect:/";
		}
	}
	
}
