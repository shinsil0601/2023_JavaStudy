package day20.com.ict.edu;


//	join() : 현재 스레드는 join()를 호출한 스레드가 끝날때까지
//			대기상태로 빠져있다가 .join()를 호출한 스레드가 끝나면
//			다시 실행한다.
//			즉, join()를 호출한 스레드가 끝나야 실행 할 수 있다.
	
public class Ex01_join {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		
		Ex01 test = new Ex01();
		Thread dog = new Thread(test,"dog");
		Thread cat = new Thread(test,"cat");
		dog.start();
		cat.start();  //join이 없어서 main이 먼저 찍힘
		
		try {
			dog.join();  //join이 끝날때까지 main은 대기탐
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("main: " + Thread.currentThread().getName());
	}
}
