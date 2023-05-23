package day04.com.ict.edu;

public class Ex02_oper {
	public static void main(String[] args) {
//		삼항연산자 중첩: 삼항 연산자가 중첩되는 것
//		형식1)  자료형 변수이름 = (조건식1) ? ((조건식2)? 조건식2가 참일때: 조건식2가 거짓일때) : 조건식1이 거짓일때 ;
//		형식2)  자료형 변수이름 = (조건식1) ? 조건식1이 참일때: ((조건식2)? 조건식2가 참일때 : 조건식2가 거짓일때) ;
//		형식2=> 조건식1이 거짓일때 조건식2를 다시 참,거짓으로 물어봄=> 많이 쓰임
		
//		(형식2) int k1이 90이상이면 "A학점", 80이상이면 "B학점", 나머지는 "F학점"
		int k1 = 55;
		String str = (k1 >= 90) ? "A학점" : (k1 >= 80) ? "B학점" : "F학점" ;
		System.out.println(str);
		
//		char k2가 대문자인지, 소문자인지, 기타문자인지 판별하자
		char k2 = 'g';
		str = (k2 >='A' && k2 <= 'Z') ? "대문자" : (k2 >= 'a' && k2 <= 'z') ? "소문자" : "기타문자" ;
		System.out.println(str);
		
//		(형식1+형식2)
//		int k3이 1 또는 3이면 남자, 2 또는 4이면 여자
//		int k3이 1 또는 2이면 1900년생, 3 또는 4는 2000년생, 나머지는 외국인
		int k3 = 4;
		str = (k3 == 1 || k3 == 3) ? (k3 == 1)? "1900년생 남자" : "2000년생 남자" :
			(k3 == 2 || k3 == 4)? (k3==2)? "1900년생 여자" : "2000년생 여자" : "외국인" ;
		System.out.println(str);
		
		
	}

}
