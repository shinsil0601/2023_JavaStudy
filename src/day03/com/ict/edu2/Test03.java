package day03.com.ict.edu2;

public class Test03 {
	public static void main(String[] args) {
//		3989초는 몇시간, 몇분, 몇초 인가?
		int i = 3989;
		int hour = i/3600;
		int min = i%3600/60;
		int sec = i%3600%60;
		
		System.out.println(hour+"시간 "+min+"분 "+sec+"초");
		
	}
	
}
