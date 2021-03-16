package br.com.cee.checkpointapi.model;

import java.io.Serializable;

public class PoiProperties implements Serializable {
	private static final long serialVersionUID = 1L;
	
	String nome;
	Double raio;
	
	public PoiProperties() {
		
	}

	public PoiProperties(String nome, Double raio) {
		super();
		this.nome = nome;
		this.raio = raio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
}
