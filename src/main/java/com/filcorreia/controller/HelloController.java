package com.filcorreia.controller;
import com.filcorreia.contactos.*;
import javax.servlet.annotation.WebServlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(value = {"/index"},method=RequestMethod.GET)
	public String index(ModelMap model) {
		model.addAttribute("message", "Hello Spring Web MVC!!!");
		return "hello";
	}

	@RequestMapping(value = {"/adicionarContacto"},method=RequestMethod.POST)
	public void receiveData(@ModelAttribute Contacto mm) {
		System.out.println("Nome :"+ mm.getNome());
		System.out.println("Email :"+ mm.getEmail());
		System.out.println("Endereço :"+ mm.getEndereco());
		System.out.println("Data Nascimento :"+ mm.getData_nasc());
		
		
		//System.out.println("Model is empty? " + model.isEmpty());
	}
}
