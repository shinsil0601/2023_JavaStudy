package day02.com.ict.edu;
class Ex05 {
	public static void main(String[] args) {
		// 국 영 수의 총점 평균 (학점 순위 정렬)
		int kor = 90;
		int eng = 80;
		int math = 80;

		// int sum = 90 + 80 + 80; => 데이터 값은 직접 쓰지않고 변수를 만들어 써준다.
		int sum = kor + eng + math;
		System.out.println(sum);

		int avg = sum / 3;
		double avg2 = sum / 3; // 소수점이 안나옴
		double avg3 = (double) (sum / 3); // 소수점의 값이 안나옴
		double avg4 = (double) (sum) / 3;
		double avg5 = sum / 3.0; // 3.0이 실수이기 때문에 형변환 됨

		// ★소수점 2째자리까지 출력★
		double avg6 = (int) (avg5 * 100) / 100.0; // ★★소수점 2째자리 까지 int로 변환 후 100으로 나눠줌

		System.out.println(avg2);
		System.out.println(avg3);
		System.out.println(avg4);
		System.out.println(avg5);
		System.out.println(avg6);

		// 1472를 원단위 절삭해서 1470으로 만들어보자
		int num1 = 1472;
		int num2 = num1 / 10 * 10;
		System.out.println(num2);
	}
}