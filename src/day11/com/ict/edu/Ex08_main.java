package day11.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
//		5명의 이름, 국어, 영어, 수학을 입력 받아서
//		이름, 총점, 평균, 학점, 순위을 구하고 
//		순위를 기준으로 오름차순 정렬해서 출력하자
	
		Scanner scan = new Scanner(System.in);
		
//		Ex08_method로 만들어진 객체만 저장하는 배열(객체형 배열 =참조자료형 배열)
//		int[] k1 = new int[]; -> 메소드 이름으로 작성
		Ex08_method[] arr = new Ex08_method[2];
		
		for (int i = 0; i < arr.length; i++) {
		Ex08_method person = new Ex08_method();  //★★★ for문안에 메소드 연결
			System.out.print("이름: ");
			person.name = scan.next();
			System.out.print("국어: ");
			person.kor = scan.nextInt();
			System.out.print("영어: ");
			person.eng = scan.nextInt();
			System.out.print("수학: ");
			person.math = scan.nextInt();
			
//			합계
			person.sum = person.kor + person.eng + person.math;
			
//			평균
			person.avg = (int)(person.sum/3.0*10) /10.0;
			
//			학점
			if (person.avg >=90) {
				person.hak = "A학점";
			} else if (person.avg >=80) {
				person.hak = "B학점";
			} else if (person.avg >=70) {
				person.hak = "C학점";
			} else {
				person.hak = "F학점";
			}
			
//			순위값 1로 지정
			person.rank = 1;
			
//			for문으로 돌린 person의 값을 arr[i]배열에 넣어줌
			arr[i] = person;
		}
		
//		순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;
				if (arr[i].sum < arr[j].sum) {
					arr[i].rank ++;
				}
			}
		}
		
//		오름차순 정렬
//		자리 바꾸기 위한 임시저장
		Ex08_method tmp =new Ex08_method();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j]= tmp;
				}
			}
		}
//		출력
		System.out.print("이름\t합계\t평균\t학점\t순위\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name+ "\t");
			System.out.print(arr[i].sum+ "\t");
			System.out.print(arr[i].avg+ "\t");
			System.out.print(arr[i].hak+ "\t");
			System.out.print(arr[i].rank+ "\n");
			
		}
		
	}
}