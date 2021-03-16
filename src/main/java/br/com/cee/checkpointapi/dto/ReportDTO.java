package br.com.cee.checkpointapi.dto;

import com.mongodb.internal.connection.Time;

public class ReportDTO {
	
	private String nomePoi;
	private String placa;
	private Integer raio;
	private Time tempo;
	
	public ReportDTO() {
		
	}

	public ReportDTO(String nomePoi, String placa, Integer raio, Time tempo) {
		super();
		this.nomePoi = nomePoi;
		this.placa = placa;
		this.raio = raio;
		this.tempo = tempo;
	}

	public String getNomePoi() {
		return nomePoi;
	}

	public void setNomePoi(String nomePoi) {
		this.nomePoi = nomePoi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getRaio() {
		return raio;
	}

	public void setRaio(Integer raio) {
		this.raio = raio;
	}

	public Time getTempo() {
		return tempo;
	}

	public void setTempo(Time tempo) {
		this.tempo = tempo;
	}	

}
