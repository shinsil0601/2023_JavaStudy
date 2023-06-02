package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex05_PreparedStatement_update {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 custid : ");
		int custid = scan.nextInt();
		System.out.print("수정할 name : ");
		String name = scan.next();
		System.out.print("수정할 address : ");
		String address = scan.next();
		System.out.print("수정할 phone : ");
		String phone = scan.next();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user ="c##shinsil";
			String password ="1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 쿼리조건
			String sql = "update customer set name = ?, address = ?, phone = ? where custid = ?";
			// ? => 바인딩 변수
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, name);  
			pstm.setString(2, address); 
			pstm.setString(3, phone); 
			pstm.setInt(4, custid);  // 쿼리의 순서를 따라 작성해야함
			
			result = pstm.executeUpdate();
			if (result > 0) {
				sql = "select * from customer";
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				while (rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			} 
			
		} catch (Exception e) {
			System.out.println("삽입 실패");
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
