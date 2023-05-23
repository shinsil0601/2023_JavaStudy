package day03.com.ict.edu2;

public class Test02 {
	public static void main(String[] args) {
//		2시간 40분 30초를 총 몇 초일까요? (환산문제)
		int hour = 60*60;
		int min = 60;
		int sec = 1;
		
		int tal = (2*hour)+(40*min)+(30*sec);
		
		System.out.println("2시간 40분 30초는 총: "+ tal +"초이다");
				
	}

}
