package day12.com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {

//	5명의 이름, 국어, 영어, 수학을 입력 받아서
//	이름, 총점, 평균, 학점, 순위을 구하고 
//	순위를 기준으로 오름차순 정렬해서 출력하자

		Scanner scan = new Scanner(System.in);

//	Ex08_method로 만들어진 객체만 저장하는 배열(객체형 배열 =참조자료형 배열)
//	int[] k1 = new int[]; -> 메소드 이름으로 작성

		Ex04_get_set[] arr = new Ex04_get_set[5];

		for (int i = 0; i < arr.length; i++) {
			Ex04_get_set person = new Ex04_get_set(); // ★★★ for문안에 메소드 연결
			System.out.print("이름: ");
			person.setName(scan.next());
			System.out.print("국어: ");
			person.setKor(scan.nextInt());
			System.out.print("영어: ");
			person.setEng(scan.nextInt());
			System.out.print("수학: ");
			person.setMath(scan.nextInt());

//		합계
			person.setSum(person.getKor() + person.getEng() + person.getMath());

//		평균
			person.setAvg((int) (person.getSum() / 3.0 * 10) / 10.0);

//		학점
			if (person.getAvg() >= 90) {
				person.setHak("A학점");
			} else if (person.getAvg() >= 80) {
				person.setHak("B학점");
			} else if (person.getAvg() >= 70) {
				person.setHak("C학점");
			} else {
				person.setHak("F학점");
			}

//		순위값 1로 지정
			person.setRank(1);

//		for문으로 돌린 person의 값을 arr[i]배열에 넣어줌
			arr[i] = person;
		}

//	순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}

//	오름차순 정렬
//	자리 바꾸기 위한 임시저장
		Ex04_get_set tmp = new Ex04_get_set();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
//	출력
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
