package br.pucpr.model;

public class Bike {
        private Long id;
	private Double capacidade;
	private String numeroSerie;

        
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        
	public Double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Double capacidade) {
		this.capacidade = capacidade;
	}
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	
	

}
