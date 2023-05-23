package day05.com.ict.edu;

public class Ex03_for2 {
	public static void main(String[] args) {
//		중첩 for문 : for문 안에 또 다른 for문이 존재하는 반복문 (시계의 시침/분침 관계)
//		형식) for(초기식1; 조건식1; 증감식1){
//			조건식1이 참일때 실행할 문장; for(초기식2; 조건식2; 증감식2){....;}
//		순서: 초기식1->조건식1->실행할문장-> 초기식2-> 조건식2-> 증감식2->
//			  거짓이면 ->안쪽 for문이 끝나면 바깥쪽 for문의 증감식으로 간다.
		
		for (int i = 1; i < 4; i++) {
			System.out.println("실행문 -1");
			for (int j = 1; j < 6; j++) {
				System.out.println("i= "+ i +", j= "+ j);
			}  //안쪽 for문 끝
			System.out.println("실행문 -2");
		} // 바깥 for문 끝

//		2단~ 9단 구구단-1
		for(int i=2; i<10; i++) {
			System.out.println("["+ i +"]단 ");
			for(int j=1; j<10; j++) {
				System.out.print(i +"*"+ j + " = "+ i * j +" \t");
			}
			System.out.println();
		}
		System.out.println("====================================");
		
//		2단~ 9단 구구단-2
		for (int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j +"*"+ i +" = "+ j * i+ " \t");
			}
			System.out.println();
		}
		
		
	}

}
