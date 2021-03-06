package com.javaex.jdbc.oracle;
import java.sql.*; //임포트 필요
import java.util.Scanner;
public class HRSalaryPstmt {

	// preparedStatement를 활용한 급여 검색 프로그램
	// 사용자로부터 최소 급여와 최대 급여를 입력
	// 급여가 이범위내에 속하는 사원의 목록을 출력
	public static void main(String[] args) {
		//커넥션
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("최소급여:");
		int minSalary = scanner.nextInt();
		System.out.print("최대급여:");
		int maxSalary = scanner.nextInt();
		
		if(minSalary > maxSalary) {
			// 값을 뒤집어준다
			int temp = minSalary;
			minSalary = maxSalary;
			maxSalary = temp;
		}
		
		scanner.close();
		
		try {
			conn = DBConfig.getConnection();
			
			// 실행 계획 준비
			String template = "SELECT first_name || ' ' || last_name as name, salary "
					+ "FROM employees WHERE salary BETWEEN ? AND ? ORDER BY salary DESC"; // 동적으로 연결할 데이터 영역 ? 표시
			pstmt = conn.prepareStatement(template);
			// 동적 데이터 
			pstmt.setInt(1, minSalary); //?에 들어감
			pstmt.setInt(2, maxSalary);
			
			//쿼리수행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString(1);
				int salary = rs.getInt(2);
				
				//출력
				System.out.printf("%s - %d%n", name, salary);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			}catch(Exception e) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
