package day15.com.ict.edu2;

public class Ex04_dog extends Ex04_abstract {  //빨간줄이뜨면 언임플리먼츠 해줌
	String name = "개똥이";
	@Override
	public void sound() {
		System.out.println("멍멍");		
	}
	@Override
	public void play() {
		System.out.println("바다에서 놀기");
	}
	@Override
	public String getName() {
		return name;
	}
	
}
