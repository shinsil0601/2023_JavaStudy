package day02.com.ict.edu;
class Ex06{
	public static void main(String[] args){
		// String : 문자열을 처리하기 위해서 만든 '클래스'
		//	기본자료형이 아니다.
		//	클래스를 자료형으로 사용하므로 참조자료형이다.
		//	기본자료형처럼 사용 가능하다.
		//	반드시 쌍따옴표(" ") 사용
		//	String 변수이름 = "데이터";

		String name = "홍길동";
		int age = 17;
		System.out.println(name);
		
		// '+'만 연산(연결)을 할 수 있으며 결과는 무조건 String 이다.
		// 실제 덧셈 연산을 하지 않고 문자와 연결하는 연결자 역할을 한다.
		name = "1000";
		age = 1000;

		System.out.println(name + 50);  //문자로 연결되었음
		System.out.println(age + 50);

		int su1 = 20;
		int su2 = 4;
		int sum = su1 + su2;  //★ 보통 많이 씀
		System.out.println(su1+su2);
		System.out.println("결과: " + su1 + su2);  //문자로 연결됨
		System.out.println("결과: " + (su1 + su2));
		System.out.println("결과: " + sum);
	}
}