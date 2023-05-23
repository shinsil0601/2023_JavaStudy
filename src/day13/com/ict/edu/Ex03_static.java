package day13.com.ict.edu;

public class Ex03_static {
//	static초기화  
//	형식: static{
//	 		초기화내용
//		  }
	
	int s1 = 100;  
	private int p1 =300;
	static int s2;
	
	public static int k1 = 100;
	static int k2 = 100;  ////default 제한자
	private static int k3 = 100;
	
//	static초기화
	static {
		m1 = 1000;  // m1의 변수선언 보다 위에 있지만 값이 적용됨 
		m2 = 1000;  // m1의 변수선언 보다 위에 있지만 값이 적용됨 
		s2 = 1000;
		k2 = 1000;
	}
	
//	생성자초기화: 인스턴스 초기화가 목적
	public Ex03_static() {
		s1 = 200;
		s2 = 400;
		s3 = 500;  //s3 은 변수선언보다 위에 있지만 값이 적용
	}
	// 이렇게 밑에서 변수선언은 잘 안한다
	int s3;
	static int m1;
	static int m2 = 500;
	
}
