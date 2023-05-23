package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {

	public static void main(String[] args) {
//		숙제 - 키보드로  값 받기
		Scanner scan = new Scanner(System.in);
//		학생수 받기
		System.out.print("학생수를 입력하세요>> ");
		int su = scan.nextInt();
		
		double[][] arr = new double[su][8];  //[8]=>번호/국어/영어/수학/총점/평균/학점(char)/순위
		for (int i = 0; i < su; i++) {
//		★★★★★★★for문이 실행될때 마다 한사람의 정보를 담을수 있는 배열을 생성한다.
			double[] p = new double[8];
			
//			키보드로 번호/ 국어/영어/수학 받기
			System.out.print("번호: ");
			p[0] = scan.nextInt();
			System.out.print("국어: ");
			p[1] = scan.nextInt();
			System.out.print("영어: ");
			p[2] = scan.nextInt();
			System.out.print("수학: ");
			p[3] = scan.nextInt();
//			총점,평균,학점,순위(초기값지정)
			p[4] = p[1]+p[2]+p[3];  //총점
			
			p[5] = (int)(p[4]/3.0*10)/10.0;  //평균
			
			if(p[5]>=90) {  //학점
				p[6] = 'A';
			} else if(p[5]>=80) {
				p[6] = 'B';
			}else if(p[5]>=70) {
				p[6] = 'C';
			}else {
				p[6] = 'F';
			}
			
			p[7] = 1;  //순위 초기값
			
//			다차원 배열에 넣자
			arr[i] = p;
		}
		
//		순위를 구하자
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
//				if (i == j) continue; //생략가능
				if(arr[i][4] < arr[j][4]) {
					arr[i][7]++;
				}
			}
		}
		
//		자리를 변경하기 위한 임시배열
		double[] tmp = new double[8];
//		순위로 오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i][7] > arr[j][7]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
//		출력
		System.out.println("번호 총점 평균 학점 순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j==1 || j==2 || j==3) continue;
				if (j==5) {
					System.out.printf("%3.1f  ",arr[i][j]);
				}else if(j==6) {
					System.out.printf("%3c ",(char)(arr[i][j]));
					
				}else {
					System.out.printf("%3d  ",(int)(arr[i][j]));
				}
			}
			System.out.println();
		}
		
	}

}
