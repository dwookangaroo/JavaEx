package com.javaex.jdbc.oracle;

import java.sql.*; // JDBC API
public class ConnectionTest {

	public static void main(String[] args) {
		String dbuser = "hr";
		String dbpass = "hr";
		Connection conn = null;
		
		try {
		// Driver Load
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		// Connection 생성
		conn = DriverManager.getConnection(DBConfig.DBURL,
											dbuser,
											dbpass);	
		System.out.println(conn);
		System.out.println("연결성공 !");
		
		
		} catch (ClassNotFoundException e){
			System.err.println("드라이버 로드 실패");
		} catch(SQLException e) {
			System.out.println("SQL ERROR!");
		} finally {
			try {
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}