
import br.pucpr.dao.EmpresaDAO;
import br.pucpr.dao.EnderecoDAO;
import br.pucpr.model.Empresa;
import br.pucpr.model.Endereco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.ribeiro
 */
public class PrincipalTeste {
    
    public static void main(String[] args){
        Endereco endereco = new Endereco();
        
        endereco.setBairro("aaaaaaaaaaaaaa");
        endereco.setCidade("aaaaaaaaaaa");
        endereco.setComplemento("CaaaaaaaaaaaasaNova");
        endereco.setEstado("EstadoaaaaaaaaaaNovo");
        endereco.setNumero(1111);
        endereco.setPais("PaisaaaaaaaaaaNovo");
        endereco.setRua("Ruanaaaaaaaaova");
        
        endereco.setId(EnderecoDAO.getInstance().insert(endereco));
        
        Empresa empresa = new Empresa();
        empresa.setCnpj(123123123);
        empresa.setEmail("empreeeeeeeeeeeeeeesa@empresa.com");
        empresa.setEndereco(endereco);
        empresa.setNome("EmpresaeeeeeeeeeeNova");
        empresa.setTelefone("456444seasdascasxcasc4-5664");
        
        empresa.setId(EmpresaDAO.getInstance().insert(empresa));
    }
}
