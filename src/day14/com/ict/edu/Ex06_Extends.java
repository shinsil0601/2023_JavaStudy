package day14.com.ict.edu;

import java.util.Random;
// 랜덤 클래스 호출방법2
public class Ex06_Extends extends Random{
//	메인메서드 위에 생성자 만들수 있음
	public Ex06_Extends() {
		int su = nextInt();
		System.out.println("Ex06 : " +su);
	}
	
	
	public static void main(String[] args) {
		Ex06_Extends test = new Ex06_Extends();
		
		
		
	}
}
