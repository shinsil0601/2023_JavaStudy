package day14.com.ict.edu5;

public class Ex02_Dog extends Ex02_Animal {
	String color = "블랙";
	
	@Override
	public void sound() {  //sound 적고  ctrl+스페이스하면 오버라이드 됨
		System.out.println("멍~멍~");
	}
	
	public void play() {
		System.out.println("잔디에서 뛰어 놀기");
	}
	
}
