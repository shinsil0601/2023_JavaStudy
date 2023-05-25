package day16.com.ict.edu;

//	추상클래스: 추상메서드를 하나이상 가지고 있는 클래스

abstract class Abc {
	int data = 1000;

	public abstract void printData();
}

class AbcTest extends Abc {  //★ 제일 많이 씀
	@Override
	public void printData() {
		System.out.println("data1 : " + data);
	}
}

class AbcTest2 {
//	상속 받지 않고 바로 객체 생성
	Abc abc = new Abc() {
		@Override
		public void printData() {
			System.out.println("data2 : " + data);
		}
	};
}

class AbcTest3 {
//	★중요 메서드나 메서드 인자에 사용된다
	public void prn() {
		new Abc() {  //일회용 객체생성
			@Override
			public void printData() {
				System.out.println("data3 : " + data);
			}
		}.printData();  //★중요 이부분은 메서드를 메서드가 호출하는 방식
	}
}

public class Ex08_Anonymous {
	public static void main(String[] args) {
		AbcTest t1 = new AbcTest();
		t1.printData();
		
		AbcTest2 t2= new AbcTest2();  //객체 생성
		System.out.println(t2.abc);  //주소가 찍힘
		t2.abc.printData();
		
		AbcTest3 t3 = new AbcTest3();
		t3.prn();
	}
}














