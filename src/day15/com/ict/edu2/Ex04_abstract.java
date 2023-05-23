package day15.com.ict.edu2;

public abstract class Ex04_abstract {  //추상메서드가 있으면 무조건 클래스도 추상클래스로!!
	
	String name = "부모:홍길동";
	public abstract void sound();  //추상메서드
	public void play(){
		System.out.println("부모:산에서 놀기");
	}
	
	public String getName(){
		return name;
	}
}
