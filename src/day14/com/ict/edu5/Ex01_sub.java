package day14.com.ict.edu5;

public class Ex01_sub extends Ex01_super{
	int weight = 35;
//	어노테이션
	@Override //정보 은닉(부모메서드 숨김)
	public void sound() {
		System.out.println("음악소리");
	}
	
	public void hobby() {
		System.out.println("잠자기");
	}
}
