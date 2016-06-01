/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.dao;

import br.pucpr.dao.utils.Conexao;
import br.pucpr.exception.BSIException;
import com.pucpr.model.Endereco;
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
public class EnderecoDAO extends PatternDAO<Endereco> {

    private static StringBuilder insertSQL = new StringBuilder()
            .append("INSERT INTO enderecos ")
            .append("	(bairro, cidade, complemento, estado, numero, pais, rua) ")
            .append("VALUES ")
            .append("	(?, ?, ?, ?, ?, ?, ?)");

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

    private static EnderecoDAO instance = new EnderecoDAO();

    private EnderecoDAO() {
    }

    public static EnderecoDAO getInstance() {
        return instance;
    }

    @Override
    public Long insert(Endereco object) {
        int cont = 1;
        Connection connection = Conexao.getInstance().obterConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(insertSQL.toString(), Statement.RETURN_GENERATED_KEYS);
            ps.setString(cont++, object.getBairro());
            ps.setString(cont++, object.getCidade());
            ps.setString(cont++, object.getComplemento());
            ps.setString(cont++, object.getEstado());
            ps.setInt(cont++, object.getNumero());
            ps.setString(cont++, object.getPais());
            ps.setString(cont++, object.getRua());

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
    public boolean update(Endereco object) {
        int cont = 1;
        Connection connection = Conexao.getInstance().obterConexao();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(updateSQL.toString());
            ps.setString(cont++, object.getBairro());
            ps.setString(cont++, object.getCidade());
            ps.setString(cont++, object.getComplemento());
            ps.setString(cont++, object.getEstado());
            ps.setInt(cont++, object.getNumero());
            ps.setString(cont++, object.getPais());
            ps.setString(cont++, object.getRua());
            ps.setLong(cont++, object.getId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new BSIException("Problemas no sistema, por favor tente mais tarde");
        } finally {
            Conexao.close(null, ps, connection);
        }
        return true;
    }

    @Override
    public boolean delete(Endereco object) {
        int cont = 1;
        Connection connection = Conexao.getInstance().obterConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(deleteSQL.toString());
            ps.setObject(cont++, object.getId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new BSIException("Problemas no sistema, por favor tente mais tarde");
        } finally {
            Conexao.close(rs, ps, connection);
        }
        return true;
    }

    @Override
    public Endereco findById(Integer id) {
        int cont = 1;
        Connection connection = Conexao.getInstance().obterConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Endereco endereco = null;
        try {
            ps = connection.prepareStatement(selectIdSQL.toString());
            ps.setObject(cont++, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                endereco = populateObject(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new BSIException("Problemas no sistema, por favor tente mais tarde");
        } finally {
            Conexao.close(rs, ps, connection);
        }
        return endereco;
    }

    @Override
    public List<Endereco> findByFilter(Endereco filter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Endereco> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Endereco populateObject(ResultSet rs) throws SQLException {
        Endereco endereco = new Endereco();
        endereco.setId(rs.getLong("id"));
        endereco.setBairro(rs.getString("bairro"));
        endereco.setCidade(rs.getString("cidade"));
        endereco.setComplemento(rs.getString("complemento"));
        endereco.setEstado(rs.getString("estado"));
        endereco.setNumero(rs.getInt("numero"));
        endereco.setPais(rs.getString("pais"));
        endereco.setRua(rs.getString("rua"));
        return endereco;
    }
}
