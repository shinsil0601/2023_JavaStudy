package day02.com.ict.edu;
class Ex03{
	public static void main(String[] args){
	//정수: 소수점이 없는 숫자
	//실수: 소수점이 있는 숫자
	//정수 < 실수 "무조건 값이 크다"

	//정수: byte < short< (char) < int < long
	//	기본은 int 이다.
	//실수: float < double
	//	기본은 double 이다.

	//1. byte : -128 ~ 127 (256 = 2^8)
	byte su1 = 125;
	System.out.println(su1);

	//2.short : -32768 ~ 32767 (65535)
	short su2 = 125;
	System.out.println(su2);

	//3. int: 정수의 기본
	int su3 =125;
	System.out.println(su3);

	//4. long: int보다 더 넓은 범위를 가지고 있음.
		//	   기본적으로 숫자뒤에 L또는 l를 붙인다(생략가능=프로모션: 더 큰자료형에게 저장 할수 있다.)
	long su4 =125l;
	System.out.println(su4);

	//*형변환
	//큰자료형과 작은 자료형이 계산하면 결과는 큰자료형으로 변경된다.
	// int + int = int      long + long = long
	//int + long = long	long + int = long
	// 정수 + 실수 = 실수
	//*예외  byte + byte = int	short + short = int
	//	 byte + short = int	short + int = int
	//	 ★char + short = int
	//프로모션: 작은자료형은 큰자료형에 저장(기록) 할수 있다
	// long = int;
	long su5 = 125;
	System.out.println(su5);

	char c1 = 'A';
	int su6 = c1;
	System.out.println(su6);

	/* int su6 = 97;  
	char c2 = su6;   잘못된 대입*/

	//�Ǽ�: float < double
	//	�⺻�� double 

	//float: 숫자 뒤에 F나 f를 붙인다.(생략 불가능)
	float su7 = 13.3f;
	System.out.println(su7);

	double su8 = 15.3;
	System.out.println(su8);

	su8 = su7;
	System.out.println(su8);

	//char를 double, int를 double에 저장해보자(프로모션)
	char ch3 = 'a';
	int su9 = 37;

	double su10 = ch3;
	System.out.println(su10);

	su10 = su9;
	System.out.println(su10);
	}
}