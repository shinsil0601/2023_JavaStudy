package day20.com.ict.edu;

// 스레드
public class Ex01 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Run :" + Thread.currentThread().getName());
		}
		sound();
	}
	public void sound() {
		for (int i = 0; i < 20; i++) {
			System.out.println("sound :" + Thread.currentThread().getName());
		}
	}
}
