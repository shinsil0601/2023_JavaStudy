package day05.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {
//		while문: for문과 같은 반복문
//		형식1)  초기식;
//				while(조건식) {
//					조건식이 참이면 실행할 문장;
//					조건식이 참이면 실행할 문장; 
//					증감식; }
//		** while문의 끝을 만나면 조건식으로 간다
		
//		형식2)  초기식;
//				while(true) {    //무한루프
//					if(빠져나갈 조건){
//						break; }
//					조건식이 참이면 실행할 문장;
//					조건식이 참이면 실행할 문장; 
//					증감식; }
//		** while문의 끝을 만나면 조건식으로 간다
		
//		1 -10까지 출력하기
		int i = 1;
		while(i < 11) {
			System.out.println("i = "+ i);
			i++;
		}
		System.out.println("====================");
		
		i = 1;
		while (true) {
			if(i >= 11) {		// 탈출조건은 출력값과 반대
				break;
			}
			System.out.println("i = "+ i);
			i++;
		}
		System.out.println("====================");
//		1 -10까지 짝수 출력하기
		i = 0;
		while (i<11) {
			if(i%2==0) {
				System.out.print(i +"  ");;
			}
			i++;
		}
		System.out.println("\n====================");
		
//		구구단중 7단 출력
		i = 1;
		while(i < 10) {
			System.out.println("7 * "+ i +" = "+ (7*i));
			i++;
		}
		System.out.println("====================");
		
//		1 ~ 10 누적합계
		i=1;
		int sum = 0;
		while(i<11) {
			sum = sum + i;
			i++;
		}
		System.out.println("누적합: " + sum);
		System.out.println("====================");
		
//		0 0 0 0
//		0 0 0 0
//		0 0 0 0
//		0 0 0 0
		i = 1;
		int j = 1;
		while(i < 5) {
			while(j < 5) {
				System.out.print("0 ");
				j++;
			}
			i++;
			j=1;
			System.out.println();
		}
		System.out.println("====================");
		
		i = 1;
		while(i < 5) {
			System.out.println("0 0 0 0");
			i++;
		}
		System.out.println("====================");
		
		i=1;
		while(i < 17) {
			System.out.print("0 ");
			if(i%4==0) {    //4의 배수를 이용해 줄바꿈
				System.out.println();
			}
			i++;
		}
		
	}

}
