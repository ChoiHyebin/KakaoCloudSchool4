package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. jdbc driver loading
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. ���� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. query �غ�
			String sql = "SELECT * FROM EMP";
			stmt = conn.createStatement();
			stmt.executeQuery(sql);
			
			rs = stmt.executeQuery(sql);
			
			// 4. query ���� �� ����
			while (rs.next()) {
				int empno = rs.getInt(1);
				String jobn = rs.getString("JOB");
				System.out.println(empno + "\t" + jobn);
			}
			System.out.println("---DB ����---");
			// �ڿ� ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// DB ����
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
	}

}
