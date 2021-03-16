package br.com.cee.checkpointapi.model;

import java.io.Serializable;
import java.util.Date;

public class PosicaoProperties implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String placa;
	private Date data_posicao;
	private Double velocidade;
	private String ignicao;
	
	public PosicaoProperties() {
		
		
	}

	public PosicaoProperties(String placa, Date data_posicao, Double velocidade, String ignicao) {
		super();
		this.placa = placa;
		this.data_posicao = data_posicao;
		this.velocidade = velocidade;
		this.ignicao = ignicao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}	

	public Date getData_posicao() {
		return data_posicao;
	}

	public void setData_posicao(Date data_posicao) {
		this.data_posicao = data_posicao;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}

	public String getIgnicao() {
		return ignicao;
	}

	public void setIgnicao(String ignicao) {
		this.ignicao = ignicao;
	}	
}
