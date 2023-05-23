package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
	public static void main(String[] args) {
	
//	5명의 이름, 국어, 영어, 수학을 입력 받아서
//	이름, 총점, 평균, 학점을 구하고 출력하자
	Scanner scan = new Scanner(System.in);
	String[] name = new String[2];
	int[] kor = new int[2];
	int[] eng = new int[2];
	int[] math = new int[2];
	int[] sum = new int[2];
	double[] avg = new double[2];
	String[] hak = new String[2];
	
//	메서드 연결
	Ex07_method test = new Ex07_method();

//	입력 받기
	for (int i = 0; i < 2; i++) {
		System.out.print("이름 : ");
		name[i] = scan.next();
		System.out.print("국어점수: ");
		kor[i] = scan.nextInt();
		System.out.print("영어점수: ");
		eng[i] = scan.nextInt();
		System.out.print("수학점수: ");
		math[i] = scan.nextInt();
		
//	총점 구하기
		test.getSum(kor[i], eng[i], math[i]);
		sum[i] = test.sum;
//	평균 구하기
		test.getAvg(sum[i]);
		avg[i] = test.avg;
//	학점 구하기
		test.getHak(avg[i]);
		hak[i] = test.hak;
	}
//	출력하기
	System.out.println("이름\t총점\t평균\t학점");
	for (int i = 0; i < hak.length; i++) {
		System.out.printf("%3s\t", name[i]);
		System.out.printf("%3d\t" , sum[i]);
		System.out.printf("%3.2f\t" , avg[i]);
		System.out.printf("%3s\t" , hak[i]);
		System.out.println();
	}
	}
}
