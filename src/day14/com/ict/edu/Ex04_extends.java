package day14.com.ict.edu;

import java.util.Random;

public class Ex04_extends {
	public static void main(String[] args) {
//		Random 클래스 사용하기
		Random ran = new Random();  //is a 관계
		int su = ran.nextInt(10)+1;  // 1-10 원래는 (0~9)인데 +1해줌
		
		System.out.println(su);
	}

}
