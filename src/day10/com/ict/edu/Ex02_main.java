package day10.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
//		static; 객체 생성 없이, 클래스.이름
		System.out.println(Ex02_class.AVG);
		System.out.println(Ex02_class.sum);
		
//		instance; 객체 생성 후 접근
//		객체생성)
//		클래스이름  참조변수 = new 생성자([인자]);
//	**  해당 클래스의 생성자가 없으면 기본생성자 사용
//	**  기본생성자란 인자가 없는 생성자, 클래스이름() = 기본생성자()
		Ex02_class test = new Ex02_class();
		System.out.println(test);
//		접근법; 참조변수.멤버필드
		System.out.println(test.name);
		System.out.println(test.GENDER);
		System.out.println(test.AVG);
		System.out.println(test.sum);
		System.out.println("=====================");
//		변수와 상수의 차이
		test.name = "일지매";
//		test.GENDER = "여성";  //상수는 값이 변할 수 없다.
		
		Ex02_class.sum = 1000;
//		Ex02_class.Avg = 12345;  //상수는 값이 변할 수 없다.
		
		System.out.println(test.name);
		System.out.println(Ex02_class.sum);
		
	}

}
