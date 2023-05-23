package day03.com.ict.edu2;

public class Test04_review {
	public static void main(String[] args) {
//		카페모카가 6,500원이다
//		친구와 둘이서 15,000원을 내고 주문했다.
//		잔돈은 얼마 인가? (단, 부가세 10% 포함)
		
//		변수 선언
		int dan = 6500;
		int su = 2;
		int in = 15000;
		
//		부가세를 구하기 위해서 총금액을 구하자
		int total = dan * su;
		int vat = total / 10;
//		int vat2 =(int)(total * 0.1); // =>부가세 구하는방법 2번째
		int out = in - (total + vat);
		System.out.println("잔돈: "+ out);
		
//		15행 ~ 19행 한번에 처리
		int out2 = in - (int)(total * 1.1);
		System.out.println("잔돈: "+ out2);
		
	}

}
