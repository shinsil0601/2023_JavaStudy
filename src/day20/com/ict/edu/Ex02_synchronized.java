package day20.com.ict.edu;

//	임계영역 : 멀티스레드에서 공통적으로 사용되는 영역 (Ex01참조)
//			   현재 실행중인 스레드가 다른 스레드에게 제어권을 빼앗긴다.
//			   이러한 경우 실시간 처리에서는 문제가 발생할 수 있다. ex)티켓팅...
//			   이를 해결하기 위한 방법이 동기화 처리이다.

//	동기화 처리 : 임계영역 앞에 synchronized 예약어를 사용함으로써
//				  현재 실행 중인 스레드가 끝날때까지 다른 스레드 접근 불가
public class Ex02_synchronized {
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		new Thread(test,"dog").start();  //"dog" => Thread 이름지정
		new Thread(test,"cat").start();
		new Thread(test,"tiger").start();
		new Thread(test,"lion").start();
											//=> 병렬처리로 되어있어서 적은 순서대로 진행되지는 않는다.
	}
}
