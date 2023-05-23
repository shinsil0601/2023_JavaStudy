package day20.com.ict.edu;

public class Ex03 implements Runnable{
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + " : " + Thread.currentThread().getName());
			if (x == 11) {
				try {
					wait();  //현재 실행하는 스레드는 대기상태로 만듬
				} catch (InterruptedException e) {
					e.printStackTrace();
				}  
			}else {
				notify();  //대기상태를 풀어줌
			}
		}
	}

}
