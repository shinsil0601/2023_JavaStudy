package day14.com.ict.edu;

public class Ex01_String {
	public static void main(String[] args) {
		String s1 = "ictedu";
		String s2 = "ictedu";
		String s3 = new String("ictedu");  //new 생성자를 이용
		String s4 = new String("ictedu");  //new 생성자를 이용
		char[] ch = {'i','c','t','e','d','u'};
		String s5 = new String(ch);
		
		System.out.println(s1);  //ictedu
		System.out.println(s2);  //ictedu
		System.out.println(s3);  //ictedu
		System.out.println(s4);  //ictedu
		System.out.println(s5);  //ictedu
		System.out.println();
		
//		// '==' 사용시 객체 주소가 같냐?
		System.out.println("*주소값 비교*");
		if (s1 == s2) {  //같다
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		if (s1 == s3) {  //같지 않다
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		if (s1 == s4) {  //같지 않다
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		if (s1 == s5) {  //같지 않다
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		System.out.println();
		
//		equals() : 내용이 같냐?
		System.out.println("*내용 비교*");
		if (s1.equals(s2)) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		if (s1.equals(s3)) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		if (s1.equals(s4)) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		if (s1.equals(s5)) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		System.out.println();
		
		s1 = s1 + "대한민국";
		System.out.println(s1);
		System.out.println(s2);
		if (s1 == s2) {  //같다
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		
		
	}
}
