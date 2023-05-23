package day03.com.ict.edu2;

public class Test04 {
	public static void main(String[] args) {
//		카페모카가 6,500원이다
//		친구와 둘이서 15,000원을 내고 주문했다.
//		잔돈은 얼마 인가? (단, 부가세 10% 포함)
		int moka = 6500;
		int peo = 2;
		int tal = 15000;
		
		moka = (int)((double)(moka) * 1.1);
		System.out.println(moka);
		
		int result = tal - peo * moka;
		System.out.println("잔돈은: "+ result);
		
	}

}
