package day12.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		
		Ex02_get_set p1 = new Ex02_get_set();
//		private 클래스에서 필드 가져오기 및 변경하기
		
//		이름 가져오기
//		String str = p1.name;
		String str = p1.getName();
		System.out.println(str);
		
//		이름 변경하기
//		p1.name ="일지매";
		p1.setName("일지매");
		String res = p1.getName();
		System.out.println(res);
		
		
	}
}
