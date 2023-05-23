package day12.com.ict.edu;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_main {

	public static void main(String[] args) {

		HomeWork_method coffee = new HomeWork_method("커피음료", 1000);
		HomeWork_method ion = new HomeWork_method("이온음료", 1500);
		HomeWork_method cola = new HomeWork_method("탄산음료", 1200);
		HomeWork_method juice = new HomeWork_method("과일주스", 1800);
		
		HomeWork_method[] arr = {coffee, ion, cola, juice};  //클래스배열에 가져올 정보생성
		int[] price = {coffee.getPrice(),ion.getPrice(),cola.getPrice(),juice.getPrice()};  //가격변수에 메서드변수 가격 넣어줌
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요>> ");
		int input = scan.nextInt();
		
//		음료들의 최소금액을 구하자(오름차순 정렬에서 맨 처음 최소값, 맨끝 최대값)
		Arrays.sort(price);
//		3.메뉴에  반환메뉴를 추가 해서 입금 후 사지  않아도 될 수 있도록 한다.
		esc:
		while(true) {
		
//		1.자판기 코드에서 입금액과 판매액 중에 
//		입금액이 작으면  무조건 계산하지 않고 입금액 출력해야 된다.
//		자판기 돈 출력
//			최소금액시 안내 멘트 
		if (input < 1000) {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈: "+ input);
			System.out.println("추가 입금을 해주세요 \n구입을 종료하시려면 나가기입력해주세요");
			input += scan.nextInt();
			continue;
		}else {
			System.out.println("커피\t이온\t탄산\t과일");
//		입력금액과 각 음료수의 가격을 비교
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].getPrice() <= input) {
					System.out.print("O\t");
				}else {
					System.out.print("X\t");
				}
			}
		}
		
		String drink ="";
//		2.잔돈이  판매액보다 크면 다시  구매할 수 있는  선택 화면이 나와 야 한다.
//		잔돈이 판매액보다 작으면  잔돈 반환
		 while(true) {
				System.out.println();
				System.out.print("메뉴를 입력하세요>>");
				drink = scan.next();
				
				switch (drink) {
				case "커피": input = input -arr[0].getPrice(); break;
				case "이온": input = input -arr[1].getPrice(); break;
				case "탄산": input = input -arr[2].getPrice(); break;
				case "과일": input = input -arr[3].getPrice(); break;
				case "나가기": break esc;
				default:
					System.out.println("잘못 선택하셨네요");
				}
				System.out.println("잔돈 "+ input);  break;
		 }
		
		}
		
	}

}
