package com.javaex.jdbc.oracle;
import java.sql.*;
public class HREmployees {

	public static void main(String[] args) {
		//커넥션생성
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConfig.getConnection();
			String sql = "SELECT first_name, last_name,"
					+ "manager_id FROM employees ORDER BY first_name desc";
			System.out.println("QUERY: " + sql);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String firstName = rs.getString(1);
				String lastName = rs.getString(2);
				String manId = rs.getString("manager_id");
				
				System.out.printf("%s %s : %s%n",
						firstName, lastName, manId);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try{
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e) {
				
			}
		}

	}

}
