package com.ronal.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ronal.project.repository.ClienteRepository;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@GetMapping("listar")
	public String listar(Model model) {
		model.addAttribute("titulo","Listado de Clientes");
		model.addAttribute("clientes", clienteRepository.findAll());
		
		return "listar";
	}

}
