/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.exception;

/**
 *
 * @author lucas.ribeiro
 */
public class BSIException extends RuntimeException{

	private static final long serialVersionUID = 4928599035264976611L;
	
	public BSIException(String message) {
		super(message);
	}
	
}
