package day20.com.ict.edu;

public class Ex02 implements Runnable{
	int x = 0;
	@Override
	public synchronized void run() {  //★synchronized 넣어줌(임계영역)
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + " : " + Thread.currentThread().getName());
		}
	}

}
