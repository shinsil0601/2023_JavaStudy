package day06.com.ict.edu;

public class Ex03_break_continue {

	public static void main(String[] args) {
//		break와 continue
//		break: 현재 위치의 블록을 탈출하는 예약어(명령어)
//		continue : continue문을 만나면 아래 수행문을 포기하고 다음회차를 하기 위해서 증감식으로 이동
//		보통 if문과 함께 사용 됨.
//		break 는 for문과 while문 모두 사용, continue는 for문에서 사용(while 문에 사용 가능)
		
//		1 ~ 10까지 출력-1
		for(int i = 1; i <11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		1 ~ 10까지 출력 6일때 break 사용
		for(int i = 1; i <11; i++) {
			if(i == 6) 
				break;
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 1; i <11; i++) {
			System.out.print(i + " ");
			if(i == 6) 
				break;
		}
		System.out.println();
		System.out.println("=========================");		
//		1 ~ 10까지 출력 6일때 continue 사용
		for(int i = 1; i <11; i++) {
			if(i == 6) 
				continue;
			System.out.print(i + " ");
		}
		System.out.println();
		/*
		for(int i = 1; i <11; i++) {
			System.out.print(i + " ");
			if(i == 6) 
				continue;
		}
		System.out.println();   //쓸모없는 코딩방식*/
		System.out.println("=========================");		
		
//		0~10까지 홀수만 출력 (continue를 이용)
		for (int i = 0; i < 11; i++) {
			if(i%2==0) continue;  //밑에 실행문을 수행안하고 증감식 이동
				System.out.print(i +" ");
		}
		System.out.println("\n=========================");		
		
		
		
		
		
	}

}
