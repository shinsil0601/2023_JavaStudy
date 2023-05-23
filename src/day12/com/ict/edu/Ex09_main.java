package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학생수를 입력하세요: ");
		int su = scan.nextInt();
		Ex09_Constructor[] arr = new Ex09_Constructor[su];
		
		for (int i = 0; i < su; i++) {
			System.out.print("이름: ");
			String name=(scan.next());
			System.out.print("국어: ");
			int kor= (scan.nextInt());
			System.out.print("영어: ");
			int eng =(scan.nextInt());
			System.out.print("수학: ");
			int math=(scan.nextInt());
			
		Ex09_Constructor p2 = new Ex09_Constructor(name,kor,eng,math);
		arr[i] = p2;
		
		}
//		순위
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (i == j)
						continue;
					if (arr[i].getSum() < arr[j].getSum()) {
						arr[i].setRank(arr[i].getRank()+1);
					}
				}
			}

//		오름차순 정렬
//		자리 바꾸기 위한 임시저장
			Ex09_Constructor tmp = new Ex09_Constructor();
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i].getRank() > arr[j].getRank()) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
		
//		출력
			System.out.print("이름\t합계\t평균\t학점\t순위\n");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i].getName() + "\t");
				System.out.print(arr[i].getSum() + "\t");
				System.out.print(arr[i].getAvg() + "\t");
				System.out.print(arr[i].getHak() + "\t");
				System.out.print(arr[i].getRank() + "\n");
			}
		
	}
}
