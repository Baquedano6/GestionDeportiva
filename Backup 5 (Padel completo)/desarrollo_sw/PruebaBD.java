package desarrollo_sw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class PruebaBD {

	/*public static void main(String[] args) {
		  	      
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			 Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/desarrollosw", "root", "1234");
		     System.out.println("Connection is created successfully");
		     java.sql.Statement stmt = conn.createStatement();
		     String query1 = "SELECT * from pruebauser where nombre = 'ruben'";
		    // String query1 = "INSERT INTO clientes " + "VALUES (6, 'vic', 'contasenaDeMediavilla')";
		    //stmt.executeUpdate(query1); 
		     ResultSet rs = stmt.executeQuery(query1); 
		     //System.out.println("Record is inserted in the table successfully..................");
		     
		     while (rs.next()) {
		    	 String id = rs.getString("id");
		    	 System.out.println(id);
		    	}
		     
		     conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//System.out.println(System.getProperty("user.name"));
		
		
		System.out.println("hola");
	}*/
	
	

}
