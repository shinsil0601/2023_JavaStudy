package day03.com.ict.edu2;

public class Test01 {
	public static void main(String[] args) {
//		이름이 홍길동인 사람의 점수가
//		국어 90, 영어 80, 수학 80점이다.
//		총점과 평균을 구하자
//		화면 출력은 이름, 총점, 평균만 출력하자
//		(단, 평균은 소수점 첫째자리까지 구하자)
		
		int kor = 90;
		int eng = 80;
		int math = 80;
		int sum;
		double avg;
		
		sum = kor + eng + math;
		avg = sum / 3.0;
		avg = (int)(avg*10)/10.0;  //뒤에 나누는 값을 '실수'로 변환
		
		System.out.println("홍길동의 총점: " + sum + " 평균: " + avg);
	}

}
