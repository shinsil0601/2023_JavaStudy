package day15.com.ict.edu;

public class Ex01_Cat extends Ex01_Animal{
	String color = "삼색";
	
	@Override
	public void sound() {
		System.out.println("야옹~");
	}
	
	public void play() {
		System.out.println("창밖을 바라본다.");
	}
	
//	부모클래스의 해당 메서드에 final이 있으면 오버라이딩 안됨.
/*	@Override
	public void sleep() {  //메소드에  final (상수개념)
		System.out.println("8시간 이상 잠을 잔다.");
	} */
	
}
