package mybatis.com.ict.edu;

import org.apache.ibatis.session.SqlSession;

// DB 처리하는 메서드들을 가지고 있는 클래스
public class DAO {
	private static SqlSession ss;
	
	// 싱글턴패턴(동기화처리): 프로그램이 종료될 때까지 한번 만들어진 객체를 재사용한다.
	private static SqlSession getSession() {
		if(ss == null) {
			ss = DBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB쳐ㅓ리하는 메서드들
}
