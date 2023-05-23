package day14.com.ict.edu5;

public class Ex02_Animal_main {
	public static void main(String[] args) {
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
		dog.sound();
		dog.hobby();
		System.out.println(dog.eyes);
		System.out.println(dog.color);
		System.out.println();

		cat.sound();
		cat.hobby();
		System.out.println(cat.eyes);
		System.out.println(cat.color);
		System.out.println();
		
//		★ 객체생성을 부모클래스 변수로 선언 ★
//		부모클래스변수 = new 자식클래스 생성자();
		Ex02_Animal animal = null;  //선언만 함
		int su = 1;
//		오버라이딩 한것만 자식클래스가 반환됨
		if (su == 1) {  //고양이
			animal = new Ex02_Cat();  //여기서 cat객체생성
		}else if(su == 2) {  //강아지
			animal = new Ex02_Dog();  //여기서 dog객체생성
		}
		
//		오버라이딩
		animal.sound();  //null 초기값 주어져야함
		
//		부모것만 나옴
		System.out.println(animal.color);
		System.out.println(animal.eyes);
		
		/*부모클래스로 선언했을때 자식클래스가 가지고 있는것을 사용 못함.
		animal.play(){
		} */
		
	}
}
