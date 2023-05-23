package day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
//		단순 if문: 조건식이 참일때만 실행, 거짓이면 if문 무시
//		조건이 만족할때만 실행 (★조건이 만족하지 않으면 실행하지 않는다)
//		형식1) if(조건식) { 조건식이 참일때 실행할 문장1; .....문장2; }
		
//		단, 실행문장이 한줄이면 {}블록을 생략 할 수 있다.
//		형식2) if(조건식) 조건식이 참일때 실행할 문장
		
//		int k1이 60 이상이면 합격. 조건식에 맞지않으면 실행안함
		int k1 = 50;
		String res = "초기값";
		if (k1 >= 60) {
			res="합격";
		}
		System.out.println(res);
		
		if(k1<60) res="불합격" ;
		System.out.println(res);
		
//		int k2가 '홀수'인지 '짝수'인지 판별하자
		int k2 = 44;
		res = "짝수";
		
		if(k2 % 2 == 1) {
			res = "홀수";
		}
		System.out.println(res);
		
//		char k3가 대문자인지, 아닌지 판별하자
		char k3 = 'S';
		res = "대문자 아님";
		
		if (k3 >= 'A' && k3 <= 'Z') {
			res = "대문자";
		}
		System.out.println(res);
		
//		근무시간이 8시간까지는 시간당 9620이고
//		8시간을 초과한 시간 만큼은 1.5배 지급한다.
//		현재 근무한 시간이 10시간이다
//		얼마를 받아야 하는가?
		int time = 10;
		int limt = 8;
		int dan = 9620;
		int pay = time*dan;
		
		if (time > limt) {
			pay = (limt*dan)+(int)((time-limt)* dan * 1.5);
		}
		System.out.println(pay);
		
	}

}
