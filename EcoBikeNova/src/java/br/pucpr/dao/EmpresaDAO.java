/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.dao;

import br.pucpr.dao.utils.Conexao;
import br.pucpr.exception.BSIException;
import br.pucpr.model.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author lucas.ribeiro
 */
public class EmpresaDAO extends PatternDAO<Empresa> {

    private static StringBuilder insertSQL = new StringBuilder()
            .append("INSERT INTO empresas ")
            .append("	(cnpj, email, nome, telefone, endereco_id)")
            .append("VALUES ")
            .append("	(?, ?, ?, ?, ?)");

    private static StringBuilder updateSQL = new StringBuilder()
            .append("UPDATE enderecos ")
            .append("SET bairro = ?, cidade = ?, complemento = ?, estado = ?, numero = ?, pais = ?, rua = ?")
            .append("WHERE id = ? ");

    private static StringBuilder deleteSQL = new StringBuilder()
            .append("DELETE FROM enderecos ")
            .append("WHERE ID = ? ");

    private static StringBuilder selectIdSQL = new StringBuilder()
            .append("SELECT id, bairro, cidade, complemento, estado, numero, pais, rua ")
            .append("FROM enderecos ")
            .append("WHERE id = ? ");

    private static StringBuilder selectAllSQL = new StringBuilder()
            .append("SELECT ID, NOME ")
            .append("FROM ARTISTA ");

    private static EmpresaDAO instance = new EmpresaDAO();

    private EmpresaDAO() {
    }

    public static EmpresaDAO getInstance() {
        return instance;
    }

    @Override
    public Long insert(Empresa object) {
        int cont = 1;
        Connection connection = Conexao.getInstance().obterConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(insertSQL.toString(), Statement.RETURN_GENERATED_KEYS);
            ps.setInt(cont++, object.getCnpj());
            ps.setString(cont++, object.getEmail());
            ps.setString(cont++, object.getNome());
            ps.setString(cont++, object.getTelefone());
            ps.setInt(cont++, object.getEndereco().getId().intValue());

            ps.executeUpdate();
            //Obtem o ID gerado pelo banco HSQLDB
            object.setId(retrievePrimaryKeygenerated(rs, ps));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new BSIException("Problemas no sistema, por favor tente mais tarde");
        } finally {
            Conexao.close(rs, ps, connection);
        }
        return object.getId();
    }

    @Override
    public boolean update(Empresa object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Empresa object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empresa findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empresa> findByFilter(Empresa filter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empresa> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Empresa populateObject(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
