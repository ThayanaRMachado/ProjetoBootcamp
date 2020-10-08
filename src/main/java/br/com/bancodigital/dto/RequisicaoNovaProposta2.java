package br.com.bancodigital.dto;

import br.com.bancodigital.model.Proposta2;

public class RequisicaoNovaProposta2 {

	private Long id;
	private String cep;
	private String logradouro;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Proposta2 toProposta2() {
		Proposta2 proposta2 = new Proposta2();
		proposta2.setCep(cep);
		proposta2.setLogradouro(logradouro);
		proposta2.setComplemento(complemento);
		proposta2.setBairro(bairro);
		proposta2.setCidade(cidade);
		proposta2.setEstado(estado);
		return proposta2;
	}
}
