package day15.com.ict.edu;

public class Main {
	public static void main(String[] args) {
		Ex01_Cat cat = new Ex01_Cat();
		
		System.out.println(cat.eyes);  //부모필드
		System.out.println(cat.color);
		
		cat.sound();
		cat.hobby();
		cat.sleep();
		cat.play();
		
		
	}
}
