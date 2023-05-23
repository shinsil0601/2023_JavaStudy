package day02.com.ict.edu;
class Ex04{
	public static void main(String[] args){
		//자료형 변환 종류: 프로모션과 디모션
		//프로모션: 작은자료형이 큰자료형으로 변환(저장)될때 문제 없이 자동으로 변환(저장)됨
		//디모션(캐스팅): 큰자료형이 작은자료형으로 변환하는 될때 오류 발생
		//		 오류가 발생 되었을때 강제로 자료형을 변경해서 오류를 방지하지만
		//		 정보 손실(원하는 정보가 아닌 정보)이 발생할 가능성이 있음.

	byte b1 = 120;
	int su1 = b1;   //프로모션 되었음
	System.out.println(su1);

	int su2 = 129;
	//byte b2 = su2;  //디모션 오류발생

	//강제 형변환:  "="을 기준으로 오른쪽 자료형을 왼쪽 자료형으로 만든다
		// 왼쪽자료형 = (왼쪽자료형)(오른쪽자료형(데이터));
	byte b2 = (byte)(su2);  //byte가 가진 값보다 su2의 값이 더 크기 때문에 정보의 오류가 난다.
	System.out.println(b2);

	char c1 = 'K';
	int su3 = c1;
	System.out.println(su3);

	int su4 = 107;
	// char c2 = su4; 오류남
	char c2 = (char)(su4);
	System.out.println(c2);
	}
}