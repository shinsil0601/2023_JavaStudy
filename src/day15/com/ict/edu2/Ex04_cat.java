package day15.com.ict.edu2;

public class Ex04_cat extends Ex04_abstract { //빨간줄이뜨면 언임플리먼츠 해줌
	String name = "나비";
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	@Override
	public void play() {
		System.out.println("들에서 놀기");
	}
	@Override
	public String getName() {
		return name;
	}
}
