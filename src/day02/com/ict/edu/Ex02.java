package day02.com.ict.edu;
class Ex02{
	public static void main(String[] args){
	//문자: 한글자를 뜻한다.
	//	숫자를 사용하는 방법과 홑따옴표(' ')를 사용하는 방법
	//	char 예약어를 사용
	//	**문자는 숫자로 저장된다

	// char 선언
	char c1;
	//변수 저장
	c1 = 97;

	//c1호출해서 출력하기
	System.out.println(c1);

	//선언과 저장을 한번에
	char c2 = 'a'-32;
	System.out.println(c2);

	// char c3 = '10'; 오류: 홑따옴표 안에는 무조건 한글자
	char c3 = '0';
	System.out.println(c3);

	char c4 = '국';
	System.out.println(c4);
	
	System.out.println(c1+","+c2+","+c3+","+c4);

	}
}