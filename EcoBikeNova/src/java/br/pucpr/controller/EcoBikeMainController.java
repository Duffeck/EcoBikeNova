/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author lucas.duffeck
 */
@Controller
public class EcoBikeMainController {
    
    @RequestMapping("/empresa/cadastro")
    public String cadastroEmpresa(){
        return "cadCliente";
    }
}
