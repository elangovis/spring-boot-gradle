package spring.boot.gradle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class APIController {
	@RequestMapping(value = "hello")
	public String hello(){
		Connection conn3 = null;
		String dbURL3 = "jdbc:postgresql://ec2-3-210-251-92.compute-1.amazonaws.com:9999/postgres";
		Properties parameters = new Properties();
		parameters.put("user", "evishdb");
		parameters.put("password", "postgresadmin");
		try {
			conn3 = DriverManager.getConnection(dbURL3, parameters);
			Statement st = conn3.createStatement();
			ResultSet rs = st.executeQuery("select * from ev_tgt.accounts"); {

				if (rs.next()) {
					System.out.println(rs.getString(2));
				}
			}} catch (SQLException e) {

				e.printStackTrace();
			}
			if (conn3 != null) {
				System.out.println("Connected to database #3");
			}
			return "Spring Boot Elango";
		}
	}
