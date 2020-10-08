package br.com.bancodigital.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.bancodigital.model.Proposta3;
import br.com.bancodigital.repository.Proposta3Repository;

@Controller
@RequestMapping("proposta")
public class Proposta3Controller {
	
	@Autowired
	Proposta3Repository proposta3Repository;

	@PostMapping("/novo3")
	public String salvarProposta3(Proposta3 proposta3, @RequestParam("fileProposta3") MultipartFile file) {
		try {
			proposta3.setImagem(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.proposta3Repository.save(proposta3);
		return "proposta/formulario3";
	}
	
	@GetMapping("formulario3")
	public String formulario2() {
		return "proposta/formulario3";
	}
	
	@GetMapping("/formulario3/{id}")
	public byte[] exibirImagem(@PathVariable Long id) {
		Proposta3 proposta3 = proposta3Repository.getOne(id);
		return proposta3.getImagem();
	}
} 