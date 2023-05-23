package day13.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		System.out.println(EX02_static.su2);
		
		EX02_static p1 = new EX02_static();
		System.out.println(p1.su1);  //11
		System.out.println(p1.su2);  //11
		
		EX02_static p2 = new EX02_static();
		System.out.println(p2.su1);  //11 => 초기값으로 돌아가서 1증가
		System.out.println(p2.su2);  //12 =>11의 값을 기억하고 1증가
		
		EX02_static p3 = new EX02_static();
		System.out.println(p3.su1);  //11
		System.out.println(p3.su2);  //13
		
		System.out.println(p1.su1);  //11
		System.out.println(p1.su2);  //13
		
	}
	
}
