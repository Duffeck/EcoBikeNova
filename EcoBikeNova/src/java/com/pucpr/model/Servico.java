package com.pucpr.model;

import java.util.ArrayList;
import java.util.List;

public class Servico {
       	private Long id;
	private Empresa contratante;
	private List<CategoriaCarga> cargas;
	private Double valorExtra;
	private Double valorTotal;
	private String obs;
	private Coordenada origem;
	private Coordenada destino;
	
	
	public Servico() {
		cargas = new ArrayList<>();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Empresa getContratante() {
		return contratante;
	}


	public void setContratante(Empresa contratante) {
		this.contratante = contratante;
	}




	public List<CategoriaCarga> getCargas() {
		return cargas;
	}


	public void setCargas(List<CategoriaCarga> cargas) {
		this.cargas = cargas;
	}


	public Double getValorExtra() {
		return valorExtra;
	}


	public void setValorExtra(Double valorExtra) {
		this.valorExtra = valorExtra;
	}


	public Double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public String getObs() {
		return obs;
	}


	public void setObs(String obs) {
		this.obs = obs;
	}


	public Coordenada getOrigem() {
		return origem;
	}


	public void setOrigem(Coordenada origem) {
		this.origem = origem;
	}


	public Coordenada getDestino() {
		return destino;
	}


	public void setDestino(Coordenada destino) {
		this.destino = destino;
	}
	
	public void addCarga(CategoriaCarga carga){
		cargas.add(carga);
	}
	
	
}
