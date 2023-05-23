package day14.com.ict.edu;

public class Ex03_Super {
//	메서드필드 선언 및 초기화
	String name = "홍길동";
	int age = 57;
	String addr = "서울 방학동";
	private String dog = "댕댕이";
	String car = "제네시스";
	
	static String playStation = "5버젼";
	
	//생성자 만들기
	public Ex03_Super() {
		System.out.println("부모클래스 생성자 : " + this);
	}
	
}
