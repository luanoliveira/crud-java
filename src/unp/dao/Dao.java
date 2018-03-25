package unp.dao;

import java.sql.SQLException;

public interface Dao {
	
	public void inserir(Object objeto) throws SQLException;
	
	public Object consultar(String codigo) throws SQLException;
	
	public void atualizar(Object objeto) throws SQLException;
	
	public void excluir(String codigo) throws SQLException;

}
