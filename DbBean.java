package pk1;

import java.sql.*;

import javax.naming.InitialContext;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class DbBean {
	
	/*String dbUrl = "jdbc:mysql://localhost/r_lms";
	String dbDriver = "com.mysql.jdbc.Driver";
	String user = "root";
	String password = "HaR6Fi9hT";
	private Connection dbConn;
    */
	
	
	private DataSource dataSource;
	private Connection connection;
    private Statement statement;

	
	public DbBean(){
		
		super();
	}
	
	public Connection connect() throws ClassNotFoundException,SQLException, NamingException{
		
		Context initContext  = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		dataSource = (DataSource)envContext.lookup("jdbc/r_lms");
		
		connection = dataSource.getConnection();
		
		return connection;
		
		  //Class.forName(dbDriver);
		  //dbConn = DriverManager.getConnection(dbUrl,user,password);
		  //return dbConn;
		
	}
	
	public void close() throws SQLException{
		
		    connection.close();
	}
	
	public ResultSet execSql(String  sql) throws SQLException{
		
		   statement = connection.createStatement();
		   ResultSet  rs = statement.executeQuery(sql);
		   
		   return (rs == null)?null:rs;
		
	}
	
	public int updateSql(String sql) throws SQLException{
		
		   statement = connection.createStatement();
		   
		   int   rs = statement.executeUpdate(sql);
		   
		  // return rs;
		   
		   return (rs == 0)?0:rs;
	}
	
	public int[]  batchUpdateSql(String sql) throws SQLException{
		
	
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		statement.addBatch(sql);
		statement.addBatch(sql);
		
	    int[] rs =	statement.executeBatch();
	
		
		return rs;
		
		
	
	}

}
