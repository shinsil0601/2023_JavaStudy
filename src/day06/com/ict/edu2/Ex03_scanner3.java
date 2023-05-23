package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_scanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		근무시간이 8시간까지는 시간당 9620이고
//		8시간을 초과한 시간 만큼은 1.5배 지급한다.
//		현재 근무한 시간이 10시간이다
//		얼마를 받아야 하는가? if~else
		System.out.print("근무시간: ");
		int time = scan.nextInt();
		int pay = 0;
		int dan = 9620;
		if (time>8) {
			pay= (int)(8*dan+dan*((time-8)*1.5));
		} else {
			pay= time * dan;
		}
		System.out.println("금액은"+ pay+"원 입니다.");
		
		 // menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
        // 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
        // 친구와 함께 2잔을 10000 내고 먹었다.
        // 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
        // (친구와 같은 음료을 먹어야 한다.)
         System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)"
                 + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
         int menu = scan.nextInt();
         String str = "";
         dan = 0;
         int in = 10000;
         int su = 2;
         if (menu == 1) {
			str = "카페모카";
			dan = 3500;
		} else if (menu == 2) {
			str = "카페라떼";
			dan = 4000;
		} else if (menu == 3) {
			str = "아메리카노";
			dan = 3000;
		} else if (menu == 4) {
			str = "과일쥬스";
			dan = 3500;
		} else {
			System.out.println("메뉴를 다시 선택해주세요.");
		} 
         int mul = dan* su;
         int vat= (int)(mul*0.1);
         int out= in-(mul + vat); 
         System.out.println("메뉴는 "+ str+ "이고 잔돈은 "+ out +"원 입니다.");		        
		
//		나라를 입력하면 수도가 출력되게 하자
//		한국=>서울, 중국=>베이징, 일본=>도쿄, 미국=>워싱턴, 이외에는 데이터 없음
//		switch 문 이용
		System.out.print("나라입력: 한국,중국,일본,미국>> ");
		String con = scan.next();
		str = "";
		switch (con) {
		case "한국":
			str="서울";
			break;
		case "중국":
			str="베이징";
			break;
		case "일본":
			str="도쿄";
			break;
		case "미국":
			str="워싱턴";
			break;
		default: str="데이터 없음";
			break;
		}
		System.out.println(con+"의 수도는 "+ str);
		
	}
}
