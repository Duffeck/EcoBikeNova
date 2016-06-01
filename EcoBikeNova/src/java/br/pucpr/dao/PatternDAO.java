/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lucas.ribeiro
 */
public abstract class PatternDAO<T>{
	
	public abstract Long insert(T object);
	
	/**
	 * Metodo responsavel por atualizar uma instancia da classe T no banco de
	 * dados. Deverá retornar true se a operacao ocorreu com sucesso
	 * @param object
	 * @return
	 */
	public abstract boolean update(T object);
	
	/**
	 * Metodo responsavel por remover uma instancia da classe T do banco de
	 * dados. Deverá retornar true se a operacao ocorreu com sucesso
	 * @param object
	 * @return
	 */
	public abstract boolean delete(T object);
	
	/////////////////////////////////////////
	// METODOS DML DE RECUPERACAO DE INFORMACAO
	/////////////////////////////////////////
	
	/**
	 * Metodo responsavel por recuperar uma instancia T do banco de dados a
	 * partir do id passado como parametro. Caso não exista objeto retornar
	 * um objeto nulo
	 * @param object
	 * @return
	 */
	public abstract T findById(Integer id);
	
	/**
	 * Utilizado para buscas com o filtro da entidade, onde este contera as
	 * informacoes relacionadas com a filtragem de dados
	 * @param filter
	 * @return
	 */
	public abstract List<T> findByFilter(T filter);	
	
	/**
	 * Metodo responsavel por recuperar uma lista de instancia T do banco de
	 * dados. Caso nao hajam restricoes recuperara todas as linhas de uma
	 * tabela
	 * @param object
	 * @return
	 */
	public abstract List<T> findAll();
	
	/**
	 * Metodo que obtem a chava primaria gerada apos o insert de um item no 
	 * @param rs
	 * @param ps
	 * @return
	 * @throws SQLException
	 */
	protected Long retrievePrimaryKeygenerated(ResultSet rs, PreparedStatement ps) throws SQLException{
		//Obtem o ID gerado pelo banco HSQLDB
		rs = ps.getGeneratedKeys();
		if(rs.next()){
			return rs.getLong(1);
		}
		return null;
	}
	
	/**
	 * Metodo responsavel por popular uma instancia T, a partir do ResultSet.
	 * Caso seja necessario fornecedor informacoes a mais para construir o
	 * objeto corretamente, utilizar os parametros variaveis, passando os 
	 * objetos necessarios
	 * @param rs
	 * @param object
	 * @return
	 * @throws SQLException
	 */
	protected abstract T populateObject(ResultSet rs) throws SQLException;
	

}