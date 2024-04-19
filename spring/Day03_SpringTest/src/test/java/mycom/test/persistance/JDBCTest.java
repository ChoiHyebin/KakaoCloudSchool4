package mycom.test.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userName = "book_ex";
		String userPw = "book_ex";
		
		try {
			Connection conn = DriverManager.getConnection(url, userName, userPw);
			log.info("DataConnection Test.....");
			log.info(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testInsert() {
		
	}
}
