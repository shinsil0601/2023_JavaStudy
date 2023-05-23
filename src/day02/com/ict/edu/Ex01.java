package day02.com.ict.edu;
class Ex01{
	public static void main(String[] args){
	// 주석: 컴파일 하지 않는 줄, 보통은 내용을 설명할때 사용
		
	//변수: 프로그램이 끝날때까지 언제든 변할수 있는 상태
	//사용법: 자료형 변수이름;
	//	  변수이름 = 들어갈 데이터;

	//논리 자료형을 선언(데이터를 저장할 공간)
	boolean b1;
	//데이터 저장
	b1 = true;   //오른쪽 데이터를 왼쪽변수에 저장됨 
		
	// b1을 호출해 보자
	//★ 이름을 호출하면 데이터가 나온다
	System.out.println(b1);

	//b1의 상태를 true에서 false로 변경하자
	//boolean b1; 잘못된 선언 =>선언은 한번만 할수있다.
	b1 = false;
	System.out.println(b1);   //변수 데이터에는 하나의 값만 저장됨

	//선언과 저장을 한번에
	boolean b2 = true;
	System.out.println(b2);

	b2 = false;
	System.out.println(b2);

	/* boolean b3 = 10;   조건값 오류
	System.out.println(b3);	*/

	}
}