package day14.com.ict.edu;

import java.util.Random;
//랜덤 클래스 호출 방법1
//랜덤 클래스 상속받음
// 중요★ 자기자신도 상속을 받으려면 객체 생성을 해줘야함
public class Ex05_extends extends Random{
	int su = nextInt();  //has a 관계
	
	public void play() {
		System.out.println("Ex05 : " +su);
	}
	
//	static 메서드는 static만 사용 가능
	public static void main(String[] args) {
//		System.out.println(su); //안됨
		
//		자기자신이라도 객체를 만들자
		Ex05_extends test = new Ex05_extends();
		test.play();
		
	}
	
	
}
