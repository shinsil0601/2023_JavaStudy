package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex05_homework2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		원하는 회수를 입력 받고 
//		숫자를 입력 받아서 
//		입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
		System.out.print("반복할 숫자를 입력하세요: ");
		int k = scan.nextInt();
		for (int i = 0; i < k; i++) {
			System.out.print("홀짝 숫자를 입력하세요: ");
			int j = scan.nextInt();
			String res = "";
			if (j%2==0) {
				res = "짝수";
			} else {
				res = "홀수";
			}
			System.out.println(j +"는 "+ res +"입니다");
		}
		
//		이름, 국어, 영어, 수학를 입력 받아서 
//		총점, 평균, 학점을 구하고 
//		이름, 총점, 평균, 학점을 출력하는 코딩 
//		(평균은 소숫점 첫째자리까지 구하자)
		System.out.print("이름>>");
		String name = scan.next();
		System.out.print("국어점수>>");
		int kor = scan.nextInt();
		System.out.print("영어점수>>");
		int eng = scan.nextInt();
		System.out.print("수학점수>>");
		int math = scan.nextInt();
		int sum = kor + eng + math;
		double avg = (int)((sum/3.0)*10)/10.0;
		String res = "";

		if(avg >=90){
			res = "a학점";
		}else if(avg >=80){
		res = "b학점";
		}else if(avg >=70){
		res = "c학점";
		}else {
		 res = "f학점";
		}
		System.out.println(name + "의 총점: "+ sum + ", 평균: "+ avg +", 학점: "+ res);
				
//		첫번째 숫자 받기  
//		두번째 숫자 받기
//		연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
//		결과값이 소수점!!!
		System.out.print("첫번째 숫자>>");
		double fir = scan.nextDouble();
		System.out.print("두번째 숫자>>");
		double sec = scan.nextDouble();
		System.out.print("연산>>\n 1=> + \n 2=> - \n 3=> * \n 4=> / \n >>>>");
		int i = scan.nextInt();
		double total=0;
		
		switch (i) {
		case 1:
			total= fir+sec;
			break;
		case 2:
			total= fir-sec;
			break;
		case 3:
			total= fir*sec;
			break;
		case 4:
			total= fir/sec;
			break;
		}
		System.out.println("값은: "+ total);
		
	}

}
