package day14.com.ict.edu4;

public class Ex01_Sub extends Ex01_Super{
	String name ="홍반장";
	int age = 13;
	double weight = 78.4;
//	** this 와 super는 같이 사용못함 **
//	 =>같이 쓰는 방법: this(인자)를 써준후 인자와 동일한 생성자 이동후 해당 생성자에 있는 super사용
//	this() : 자기자신 생성자를 뜻함
//			 생성자의 첫번째 줄에 있어야 다른생성자를 호출할수 있다.
//	public Ex01_Sub() {
//		this("홍두깨", 14);  //밑에 13행 생성자에 반환됨
//	}
	
//	super() : 부모클래스
//	자식클래스 생성자 '무조건' 첫줄에 부모클래스 생성자가 숨어있다.
	public Ex01_Sub() {
		super("서울 마포구");  //인자값과 같은형태의 생성자를 찾아감
	}
	public Ex01_Sub(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}
	
}
