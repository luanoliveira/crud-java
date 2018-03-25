package unp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String URL="jdbc:mysql://localhost:3307/unp";
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String USUARIO="root";
    private static final String SENHA="usbw";
    
    public static Connection getConexao() throws SQLException{
        try {
	        Class.forName(DRIVER);
	        System.out.println("Conectado ao banco");
	        return DriverManager.getConnection(URL, USUARIO, SENHA);
	   }
	    catch (ClassNotFoundException e){
	       throw new SQLException(e.getMessage());
	    }
    }
}
