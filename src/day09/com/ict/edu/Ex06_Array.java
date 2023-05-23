package day09.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		학급 인원수를 입력받자
		System.out.print("학생수 : ");
		int su = scan.nextInt();
		
//		배열 선언
		String name[]= new String[su];
		int kor[]= new int[su];
		int eng[]= new int[su];
		int math[]= new int[su];
		
		int[] sum = new int[su];
		double[] avg = new double[su];
		String[] hak = new String[su];
		int[] rank = new int[su];
		
		
		for (int i = 0; i < su; i++) {  //인원수만큼 이름,국어,영어,수학 점수 입력받음
			System.out.print("이름을 입력하세요");
			name[i] = scan.next();
			System.out.print("국어점수 입력>> ");
			kor[i]= scan.nextInt();
			System.out.print("영어점수 입력>> ");
			eng[i]= scan.nextInt();
			System.out.print("수학점수 입력>> ");
			math[i]= scan.nextInt();
			rank[i] = 1;
		}
		for (int i = 0; i < su; i++) {  //합계, 평균, 학점 반복문
			sum[i] = kor[i] + eng [i] + math[i];
			avg[i] = (int)(sum[i] / 3.0 *10) / 10.0 ;
			if (avg[i]>=90) {
				hak[i] = "A학점";
			}else if(avg[i]>=80) {
				hak[i] = "B학점";
			}else if(avg[i]>=70) {
				hak[i] = "C학점";
			}else {
				hak[i] = "F학점";
			}
		}
		
		for (int i = 0; i < su; i++) {  //순위 구하기
			for (int j = 0; j < su; j++) {
				if (i == j) continue; 
				if(sum[i] < sum[j]) {
						rank[i]++;
					}
			}
		}
//		출력하기
		System.out.println("이름 총점  평균   학점  순위");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"   ");
			System.out.print(sum[i]+"   ");
			System.out.print(avg[i]+"   ");
			System.out.print(hak[i]+"   ");
			System.out.println(rank[i]);
		}
	}

}
