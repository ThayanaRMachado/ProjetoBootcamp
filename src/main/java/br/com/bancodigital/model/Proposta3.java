package br.com.bancodigital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Proposta3 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	private byte[] imagem;

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

}
