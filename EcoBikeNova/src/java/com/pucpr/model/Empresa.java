package br.pucpr.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private Long id;
	private Integer cnpj;
	private String nome;
	private String telefone;
	private String email;
	private Endereco endereco;
	private List<Servico> servicos;
	
	
	public Empresa() {
		servicos = new ArrayList<>();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
        
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
		
	}
	
	public void addServico(Servico servico){
		servicos.add(servico);
	}
	
	
	

}
