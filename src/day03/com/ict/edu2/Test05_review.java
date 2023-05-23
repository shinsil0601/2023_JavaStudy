package day03.com.ict.edu2;

public class Test05_review {
	public static void main(String[] args) {
		
		int su = 3781;
		
		int c = 0;  //천의 자리
		int b = 0;  //백의 자리
		int s = 0;  //십의 자리
		int i = 0;  //일의 자리
		int res = 0;  //★★ 나머지 저장값
		
		
		c =su / 1000;     // c = 3
		res = su % 1000;  // res = 781
		
		b = res / 100;   // b = 7
		res = res % 100;  // res = 81
		
		s= res /10 ;   // s = 8
		i = res % 10;  // res = 1  ->일의자리
		
//		출력되는 결과 값
//		천의 자리 : 3
//		백의 자리 : 7
//		십의 자리 : 8
//		일의 자리 : 1
		System.out.println("천의 자리: "+ c);
		System.out.println("백의 자리: "+ b);
		System.out.println("십의 자리: "+ s);
		System.out.println("일의 자리: "+ i);
		
	}

}
