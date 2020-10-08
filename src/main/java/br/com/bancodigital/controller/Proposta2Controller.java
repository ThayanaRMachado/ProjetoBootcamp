package br.com.bancodigital.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bancodigital.dto.RequisicaoNovaProposta2;
import br.com.bancodigital.model.Proposta2;
import br.com.bancodigital.repository.Proposta2Repository;

@Controller
@RequestMapping("proposta")
public class Proposta2Controller {

	@Autowired
	Proposta2Repository proposta2Repository;

	@GetMapping("formulario2")
	public String formulario2() {
		return "proposta/formulario2";
	}
	
	@PostMapping("novo2")
	public String novo(@Valid RequisicaoNovaProposta2 requisicao2)
	{
		Proposta2 p2 = requisicao2.toProposta2();
		proposta2Repository.save(p2);
		return "proposta/formulario3";
	}
}
