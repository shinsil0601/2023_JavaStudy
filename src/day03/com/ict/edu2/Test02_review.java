package day03.com.ict.edu2;

public class Test02_review {
	public static void main(String[] args) {
//		2시간 40분 30초를 총 몇 초일까요? (환산문제)
		int hour = 2*60*60;  //시간 => 초
		int min = 40*60;  //분 => 초
		int sec = 30*1;
		
		int tal = (hour)+(min)+(sec);
		
		System.out.println("2시간 40분 30초는 "+ tal +"초이다");
		
	}

}
