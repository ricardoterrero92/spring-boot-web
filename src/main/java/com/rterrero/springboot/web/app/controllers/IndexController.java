package com.rterrero.springboot.web.app.controllers;

import com.rterrero.springboot.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"/index", "/", "", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework con Model !");
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {

		Usuario usuario = new Usuario();
		usuario.setNombre("Ricardo");
		usuario.setApellido("Terrero");

		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: " + usuario.getNombre());
		return "perfil";
	}

}
