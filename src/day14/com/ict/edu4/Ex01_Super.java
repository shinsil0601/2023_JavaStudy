package day14.com.ict.edu4;

public class Ex01_Super {
	String name = "홍길동";
	int age = 54;
	String addr = "서울 방학동";
	String car = "제네시스";
	
//	tip!! ★부모생성자 만들땐 항상 기본생성자를 만들어준다
	public Ex01_Super() {
		
	}
	
//	기본생성자가 없이 사용자 생성자를 만들땐 자식생성자에 부모의 사용자생성자를 만든다.
	public Ex01_Super(String addr) {
		this.addr = addr;
	}
	
}
