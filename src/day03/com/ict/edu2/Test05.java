package day03.com.ict.edu2;

public class Test05 {
	public static void main(String[] args) {
//		출력되는 결과 값
//		천의 자리 : 3
//		백의 자리 : 7
//		십의 자리 : 8
//		일의 자리 : 1
		
		int su = 3781;
		int th =su / 1000;
		int mil=su % 1000 / 100;
		int ten=su % 1000 % 100 / 10;
		int fr=su % 1000 % 100 % 10;
		
		System.out.println("천의 자리: "+ th);
		System.out.println("백의 자리: "+ mil);
		System.out.println("십의 자리: "+ ten);
		System.out.println("일의 자리: "+ fr);
		
	}

}
