package spring.boot.gradle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class APIRepositoryImpl {
	
	public String getDetails()
	{
		System.out.println("into method");
		
		String sqlSelectAllPersons = "SELECT * FROM user";
		String connectionUrl = "jdbc:mysql://localhost:3306/springbatch";

		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "@12Patni"); 
		        PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons); 
		        ResultSet rs = ps.executeQuery()) {
			 System.out.println("name1");
		        while (rs.next()) {
		            long id = rs.getLong("id");
		            String name = rs.getString("name");
		            
                    System.out.println("name"+name);
		            // do something with the extracted data...
		        }
		} catch (SQLException e) {
		    e.printStackTrace();
		}
		return "dao value";
	}

}
