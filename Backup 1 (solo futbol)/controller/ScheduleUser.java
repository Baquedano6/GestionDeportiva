package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ScheduleUser {

	public void booking(String id) {
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/desarrollosw", "root",
					"1234");
			System.out.println("Connection is created successfully");
			java.sql.Statement stmt = conn.createStatement();
			// String query1 = "SELECT * from pruebauser where nombre = 'ruben'";
			String query1 = "INSERT INTO pruebauser " + "VALUES ('" + id + "', '" + System.getProperty("user.name") + "')";
			//String query1 = "INSERT INTO pruebauser " + "VALUES ('padel', 'jon')";
			stmt.executeUpdate(query1);
			// ResultSet rs = stmt.executeQuery(query1);
			// System.out.println("Record is inserted");

			// while (rs.next()) {
			// String id = rs.getString("id");
			// System.out.println(id);
			// }

			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public List<String> previus() {
		
		List<String> idList = new LinkedList<>();
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			 Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/desarrollosw", "root", "1234");
		     System.out.println("Connection is created successfully");
		     java.sql.Statement stmt = conn.createStatement();
		     String query1 = "SELECT id from pruebauser";
		    // String query1 = "INSERT INTO clientes " + "VALUES (6, 'vic', 'contasenaDeMediavilla')";
		    //stmt.executeUpdate(query1); 
		     ResultSet rs = stmt.executeQuery(query1); 
		     //System.out.println("Record is inserted in the table successfully..................");
			
			
			 while (rs.next()) {
				 String id = rs.getString("id");
				 idList.add(id);
				 
				 }

			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return idList;
	}
	//-----------------------------------------------------
public List<String> previus2() {
		
		List<String> nombreList = new LinkedList<>();
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			 Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/desarrollosw", "root", "1234");
		     System.out.println("Connection is created successfully");
		     java.sql.Statement stmt = conn.createStatement();
		     String query1 = "SELECT nombre from pruebauser";
		    // String query1 = "INSERT INTO clientes " + "VALUES (6, 'vic', 'contasenaDeMediavilla')";
		    //stmt.executeUpdate(query1); 
		     ResultSet rs = stmt.executeQuery(query1); 
		     //System.out.println("Record is inserted in the table successfully..................");
			
			
			 while (rs.next()) {
				 String nombre = rs.getString("nombre");
				 nombreList.add(nombre);
				 
				 }

			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return nombreList;
	}
	
	
	
	
	

}
