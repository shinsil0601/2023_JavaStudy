package day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

//	다중catch: 예외가 여러가지 발생할 경우
//	※주의사항※: Exception을 사용할 경우 반드시 가장 아래 catch문에 사용
//		형식: try{
// 				 예외가 발생 가능한 문장들;
// 				+예외가 발생되면 아래 문장들을 무시하고, catch문으로 이동한다.
// 				 예외가 발생 가능한 문장들;
//				} catch(예상되는_예외객체1 변수명){
//				 예외 발생시 수행할 문장;
//				} catch(예상되는_예외객체2 변수명){
//				 예외 발생시 수행할 문장;
//				} catch(예상되는_예외객체3 변수명){
//				 예외 발생시 수행할 문장;
//				} 

public class Ex02_Exception {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		try {
			int su1 = 50;
			System.out.print("정수입력: ");
			int su2 = scan.nextInt();
			System.out.print("정답: " + (su1/su2)+"\n");
			
		} catch (InputMismatchException e) {  //다중catch일 경우 처음에 (Exception e)->사용안됨
			System.out.println("숫자를 입력하세요");
			scan.nextLine(); //스캐너클래스가 반복문밖에 있으므로 키보드버퍼를 지워준다
		}catch (ArithmeticException e) {
			System.out.println("0으로는 나눌수 없습니다.");
		}
//		break;
		}
//		System.out.println("수고하셨습니다."); 
	}
}
