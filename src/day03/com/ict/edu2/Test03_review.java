package day03.com.ict.edu2;

public class Test03_review {
	public static void main(String[] args) {
//		3989초는 몇시간, 몇분, 몇초 인가?
		int time = 3989;
		int hour = 0;
		int min = 0;
		int sec = 0;
		int res = 0;  // ★★ 나머지를 저장하는 장소
		
		hour = time /(60*60);  
		res = time % (60*60);  //time을 hour로 나눈 나머지
		
		min = res / 60;  //남은 389의 분 구하기
		sec = res % 60;
		
		System.out.println(hour+"시간 "+min+"분 "+sec+"초");
		
	}
	
}
