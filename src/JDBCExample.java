import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	public static void main(String args[]) throws ClassNotFoundException, SQLException 
	{
		Class.forName("org.hsqldb.jdbc.JDBCDriver");
		Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb","SA","" );
		Statement ste = con.createStatement();
		String sqlquery = "Select * from employee ";
		ResultSet rs = ste.executeQuery(sqlquery);
		while(rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("Name"));
			System.out.println(rs.getInt("salary"));
			
		}
		
	}
}
