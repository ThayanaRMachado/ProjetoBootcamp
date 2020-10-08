package br.com.bancodigital.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bancodigital.dto.RequisicaoNovaProposta1;
import br.com.bancodigital.model.Proposta1;
import br.com.bancodigital.repository.Proposta1Repository;

@Controller
@RequestMapping("proposta")
public class Proposta1Controller {
	
	@Autowired
	Proposta1Repository proposta1Repository;
	
	@GetMapping("formulario")
	public String formulario() {
		return "proposta/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovaProposta1 requisicao)
	{
		Proposta1 p1 = requisicao.toProposta1();
		proposta1Repository.save(p1);
		return "proposta/formulario2";
	}
}
