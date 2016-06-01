
import br.pucpr.dao.EmpresaDAO;
import br.pucpr.dao.EnderecoDAO;
import com.pucpr.model.Empresa;
import com.pucpr.model.Endereco;

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
        
        endereco.setBairro("BairroNovo");
        endereco.setCidade("CidadeNova");
        endereco.setComplemento("CasaNova");
        endereco.setEstado("EstadoNovo");
        endereco.setNumero(1111);
        endereco.setPais("PaisNovo");
        endereco.setRua("Ruanova");
        
        endereco.setId(EnderecoDAO.getInstance().insert(endereco));
        
        Empresa empresa = new Empresa();
        empresa.setCnpj(123123123);
        empresa.setEmail("empresa@empresa.com");
        empresa.setEndereco(endereco);
        empresa.setNome("EmpresaNova");
        empresa.setTelefone("4564-5664");
        
        empresa.setId(EmpresaDAO.getInstance().insert(empresa));
    }
}
