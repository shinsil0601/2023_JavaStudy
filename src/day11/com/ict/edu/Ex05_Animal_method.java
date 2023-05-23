package day11.com.ict.edu;

public class Ex05_Animal_method {
//	생존여부
	boolean live;
//	나이
	int age;
//	이름
	String name;
	
//	생존여부를 변경하는 메서드
	public void setLive(boolean k1) {
		live = k1;
	}
//	생존여부를 반환(출력)하는 메서드
	public boolean getLive() {
		System.out.println(live);
		return live;
	}
//	나이를 변경하는 메서드
	public void setAge(int k1) {
		age = k1;
	}
//	나이를 반환하는 메서드
	public int getAge() {
		return age;
	}
//	이름을 변경하는 메서드
	public void setName(String k1) {
		name = k1;
	}
//	이름을 반환하는 메서드
	public String getName() {
		return name;
	}
	
//	이름, 나이, 생존여부 한번에 변경하자
	public void play(int s2, boolean s3, String s1) {
		name = s1;
		age = s2;
		live = s3;
	}
	/*
	public void play( int s2, String s1, boolean s3) {
		name = s1;
		age = s2;
		live = s3;
	} */ // 순서가 달라도 메서드는 생성된다.
	
//	이름, 나이, 생존여부 한번에 반환하자
//	반환하는 것은 자료형이 다 다르기때문에 할수없다.
	
//	이름, 나이, 생존여부 한번에 출력하자
	public void prn() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		if (live) {
			System.out.println("생존여부: 살았음");
		}else {
			System.out.println("생존여부: 죽었음");
		}
	}
	
	
}



