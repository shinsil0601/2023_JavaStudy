package day19.com.ict.edu;
//	상속 스레드
public class Ex02_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
//		멀티스레드: 여러개의 스레드를 만들어서 병렬처리
//		스레드 만드는 방법: start()를 호출해서 run()로 가면 스레드 생성 (일꾼생성)
		dog.start();
		cat.start();
//		start메서드가 있으면 멀티스레드를 동작할수 없다.
		
		System.out.println("main : " + Thread.currentThread().getName());
		
		
		
	}
}
