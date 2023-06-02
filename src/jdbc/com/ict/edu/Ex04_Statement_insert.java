package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// CUSTOMER 테이블에서 박씨성을 가진 사람의 모든 정보를 검색하자
public class Ex04_Statement_insert {
	public static void main(String[] args) {
//		1. java 오라클에 접속할 수 있도록 도와주는 클래스
		Connection conn = null;
//		2. SQL 구문 작성을 도와주는 클래스
		Statement stmt = null;
		
//		3-1. select문의 결과를 받는 클래스
		ResultSet rs = null;
//		3-2. select문을 제외한(delete, update, insert) 결과를 받는 변수
		int result = 0;
		
//		4. jdbc 드라이버 로딩 : 오라클, MySQL 등 각각 내용이 다르다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			5. 접속하기 위한 정보 저장
//			오라클, MySQL 각각 내용이 다르다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##shinsil";
			String password = "1111";
			
//			6. 접속하기
			conn = DriverManager.getConnection(url, user, password);
			
//			7. SQL 작성하기
			String sql = "select * from CUSTOMER where name like '박%'";
			
			
//			8. SQL를 보낼수 있는 구문 만들기
			stmt = conn.createStatement();
			
//			9. SQL를 담아서 보내고 결과받기
//			9-1. select
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				System.out.print(rs.getString("custid")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("address")+"\t");
				System.out.print(rs.getString("phone")+"\t");
				System.out.println();
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
