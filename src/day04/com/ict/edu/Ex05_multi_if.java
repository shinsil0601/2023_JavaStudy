package day04.com.ict.edu;

public class Ex05_multi_if {
	public static void main(String[] args) {
//		다중 if문(중첩)
//		형식) if(조건식1){조건식1이 참일때 실행할 문장; ...문장2;
//				}else if(조건식2){조건식1이 '거짓'이면서 조건식2가 '참'일때 실행할 문장; ...문장2;
//				}else if(조건식3){조건식1,2는 '거짓'이면서 조건식3이 참일때 실행할 문장; ...문장2;
//				}else {조건식1,2,3 모두 거짓인 경우}
		
//		int k1의 점수가 90이상이면 A학점, 80이상이면 B학점, 70이상이면 C학점, 나머지 F학점
		int k1 = 88;
		String str = "";
		
		if (k1>=90) {
			str = "A학점";
		} else if (k1 >= 80) {
			str = "B학점";
		} else if (k1 >= 70) {
			str = "C학점";
		}else {
			str ="F학점";
		}
		System.out.println(str);
		
//		char k2가 대문자인지, 소문자인지, 숫자인지, 기타인지 판별하자
		char k2 = '$';
		if (k2 >= 'A' && k2 <='Z') {
			str = "대문자";
		} else if (k2 >= 'a' && k2 <='z'){
			str = "소문자";
		} else if (k2 >= '0' && k2 <='9') {
			str = "숫자";
		} else {
			str = "기타";
		}
		System.out.println(str);
		
//		char k3이 A,(또는) a이면 "아프리카", B,b이면 "브라질", C,c이면 "캐나다", 나머지는 한국
		char k3 = 'z';
		
		if (k3 == 'A' || k3 == 'a') {
			str = "아프리카";
		} else if(k3 == 'B' || k3 == 'b') {
			str = "브라질";
		} else if(k3 == 'C' || k3 == 'c') {
			str = "캐나다";
		} else {
			str = "한국";
		}
		System.out.println(str);
		
//		menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
//		4이면 과일쥬스 3500이다. 친구와 2잔을 10000을 내고 먹었다.
//		잔돈은 얼마인가? (부가세 10% 포함), 친구와 같은 음료만 선택 가능
		int menu0 = 5;
		int menu1 = 3500;
		int menu2 = 4000;
		int menu3 = 3000;
		int menu4 = 3500;
		int su = 2;
		int in = 10000;
		int total = 0;
		
		if (menu0 == 1) {
			total = in-(int)(menu1 * su * 1.1);
		} else if(menu0 == 2) {
			total = in-(int)(menu2 * su * 1.1);
		} else if(menu0 == 3) {
			total = in-(int)(menu3 * su * 1.1);
		}else {
			total = in-(int)(menu4 * su * 1.1);
		}
		System.out.println(total);
		
		System.out.println("=============메뉴코딩 선생님해설==============");
		
		int menu = 2;
		int in1 = 10000;
		int su1 = 2;
		int dan1 = 0;
		String drink = "";
		
		if (menu == 1) {
			drink = "카페모카";
			dan1 = 3500; 		//지역변수 {}블록안에 변수 선언하면 {}을 벗어나면 변수는 사라짐
		} else if(menu == 2) {
			drink = "카페모카";
			dan1 = 3500; 
		} else if(menu == 3) {
			drink = "카페모카";
			dan1 = 3500; 
		}else if(menu == 4) {
			drink = "카페모카";
			dan1 = 3500; 
		}else {
			drink = "메뉴를 다시 선택해주세요";
		}
		
		int total1 = dan1 * su1;
		int vat = (int) (total1 * 0.1);
		int out = in1 - (total1 + vat);
		
		System.out.println("선택메뉴: "+ drink);
		System.out.println("잔돈: "+ out);
		
	}

}
