package day11.com.ict.edu;

public class Ex05_Animal_main1 {
	public static void main(String[] args) {
//		객체생성
		Ex05_Animal_method animal = new Ex05_Animal_method();

//		변경할 정보
//		이름: 큰뿔소
		animal.setName("큰뿔소");
//		나이: 3
		animal.setAge(3);
//		생존여부: 살아있음
		animal.setLive(true);

//		결과 출력
		String m1= animal.getName();
		System.out.println("이름: " + m1);
		
		int m2 = animal.getAge();
		System.out.println("나이: "+ m2);
		
		boolean m3 = animal.getLive();
		if(m3) {
			System.out.println("생사여부: 살았음");
		}else {
			System.out.println("생사여부: 죽었음");
		}
		
		System.out.println("================");
//		이름 펭귄, 나이 1, 생존여부 살아있음 으로 변경
		animal.setName("펭귄");
		animal.setAge(1);
		animal.setLive(true);
		
//		결과 출력
		String p1= animal.getName();
		System.out.println("이름: " + p1);
		
		int p2 = animal.getAge();
		System.out.println("나이: "+ p2);
		
		boolean p3 = animal.getLive();
		if(p3) {
			System.out.println("생사여부: 살았음");
		}else {
			System.out.println("생사여부: 죽었음");
		}
		System.out.println("================");
		
		animal.play(14,false,"엄지");
		animal.prn();
		System.out.println("================");
		
		animal.play(14,true,"까치");
		animal.prn();
	}

}
