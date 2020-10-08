package br.com.bancodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.bancodigital.model.Proposta1;
import br.com.bancodigital.repository.Proposta1Repository;

@Controller
public class HomeController {

	@Autowired
	private Proposta1Repository repository;
	
	@GetMapping("/home")
	public String home(Model model) {
		List<Proposta1> propostas = repository.findAll();
		model.addAttribute("propostas", propostas);
		return "home"; 
	}
}
