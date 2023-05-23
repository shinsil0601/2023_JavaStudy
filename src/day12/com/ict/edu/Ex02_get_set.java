package day12.com.ict.edu;

public class Ex02_get_set {
	
//	필드를 바로 가져올수 있음
	/*String name = "홍길동";
	int age = 24;
	double weight = 72.6;*/
	
//	직접 접근을 막기 위해서 접근제한자(private)를 사용해야한다.
	private String name = "홍길동";
	private int age = 24;
	private double weight = 72.6;
	private	boolean gender = true;
	
//	get() / set()를 이용해서 외부클래스로 주고 받을수 있게 한다.
//	get() => 반환(주다) / set() => 변경하기
//	지역변수와 전역변수 이름이 같으면 전역변수에 this를 붙인다.
//	지역변수가 전역변수보다 우선순위가 높다
	public String getName() {
		return name;
	}
	public void setName(String name) {  
		this.name = name;  //this.전역변수=지역변수 이름이 같으면 무조건 전역변수에 this 붙인다.
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
}
