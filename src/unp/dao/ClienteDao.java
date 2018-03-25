package unp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import unp.Conexao;
import unp.model.Cliente;

public class ClienteDao implements Dao {

	@Override
	public void inserir(Object objeto) throws SQLException {
		Cliente cliente = (Cliente) objeto;
		
		Connection conexao = Conexao.getConexao();
		
		String query = "INSERT INTO clientes (codigo, nome, email, telefone) VALUES (?,?,?,?)";
		
		PreparedStatement ps = conexao.prepareStatement(query);
		ps.setString(1, cliente.getCodigo());
		ps.setString(2, cliente.getNome());
		ps.setString(3, cliente.getEmail());
		ps.setString(4, cliente.getTelefone());
		ps.execute();
		ps.close();		
	}

	@Override
	public Cliente consultar(String codigo) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conexao = Conexao.getConexao();
		
		PreparedStatement ps = conexao.prepareStatement("SELECT cli.* FROM clientes AS cli WHERE cli.codigo=?");
		
		ps.setString(1, codigo);
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(rs.getString("codigo"));
		cliente.setNome(rs.getString("nome"));
		cliente.setEmail(rs.getString("email"));
		cliente.setTelefone(rs.getString("telefone"));
		return cliente;
	}

	@Override
	public void atualizar(Object objeto) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(String codigo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
