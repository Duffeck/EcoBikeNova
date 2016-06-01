package com.pucpr.model;

public class CategoriaCarga {
	private Long id;
	private String nome;
	private String descrição;
        private Double tamanhoMax;//Maior dimensão da carga!
        private Double tamanhoMin;
        private Double pesoMax;
        private Double pesoMin;
	private Double precoCat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Double getTamanhoMax() {
        return tamanhoMax;
    }

    public void setTamanhoMax(Double tamanhoMax) {
        this.tamanhoMax = tamanhoMax;
    }

    public Double getTamanhoMin() {
        return tamanhoMin;
    }

    public void setTamanhoMin(Double tamanhoMin) {
        this.tamanhoMin = tamanhoMin;
    }

    public Double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(Double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public Double getPesoMin() {
        return pesoMin;
    }

    public void setPesoMin(Double pesoMin) {
        this.pesoMin = pesoMin;
    }

    public Double getPrecoCat() {
        return precoCat;
    }

    public void setPrecoCat(Double precoCat) {
        this.precoCat = precoCat;
    }
	
        
        
}
