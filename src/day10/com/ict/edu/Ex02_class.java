package day10.com.ict.edu;

public class Ex02_class {
//	클래스는 멤버필드, 멤버메서드, 생성자
//	멤버필드: 상태값, 속성, 데이터...
//		- 변수: 언제든지 변경할수있는 데이터를 저장하는 공간
//		- 상수: 한번 저장되면 변경할수 없는 데이터를 저장하는 공간, ** final 예약어 사용
//		- instance: 클래스가 객체로 생성될때 같이 생성되는 필드
//		- static: 객체생성과 상관없이 먼저 생성되는 필드, ** static 예약어 사용
	
	String name = "홍길동";  		//인스턴스 변수(일반적인 변수)
	final String GENDER = "남성";  //인스턴스 상수
	
	static int sum = 300;			//static 변수
	static final int AVG = 80;		//static 상수 (API에서 쓰는 상수)
	
	
	
////	변수와 상수의 차이점
//	name = "일지매";
//	gender = "여성";
	
	
}



