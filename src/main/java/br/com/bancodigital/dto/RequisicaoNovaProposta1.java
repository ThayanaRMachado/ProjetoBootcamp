package br.com.bancodigital.dto;

import javax.validation.constraints.NotBlank;

import br.com.bancodigital.model.Proposta1;



public class RequisicaoNovaProposta1 {

	  
	private String nomeCliente;
	
	private String sobrenomeCliente;
	
	private String email;
	
	private String cpf;
	
	private String dataNascimento;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}

	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Proposta1 toProposta1() {
		Proposta1 proposta = new Proposta1();
		proposta.setNomeCliente(nomeCliente);
		proposta.setSobrenomeCliente(sobrenomeCliente);
		proposta.setEmail(email);
		proposta.setCpf(cpf);
		proposta.setDataNascimento(dataNascimento);
		return proposta;
	}
}
