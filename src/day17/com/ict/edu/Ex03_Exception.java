package day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

//	finally: 예외처리와 상관없이 반드시 실행해야 되는 문장을 처리할때 사용
//			 주로 데이터베이스, 네트워크, 입/출력에서 사용
//	 형식: try{
// 			  예외가 발생 가능한 문장들;
//			+예외가 발생되면 아래 문장들을 무시하고, catch문으로 이동한다.
// 			  예외가 발생 가능한 문장들;
//			} catch(예상되는_예외객체1 변수명){
//			  예외 발생시 수행할 문장;
//			} catch(예상되는_예외객체2 변수명){
//			  예외 발생시 수행할 문장;
//			}finally{
//			반드시 실행 해야 되는 문장;
//			}
	
public class Ex03_Exception {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int su1 = 50;
			System.out.print("정수입력: ");
			int su2 = scan.nextInt();
			System.out.print("정답: " + (su1/su2)+"\n");
		} catch (InputMismatchException e) {  //다중catch일 경우 처음에 (Exception e)->사용안됨
			System.out.println("숫자를 입력하세요");
			//return;  //메인메서드에 대한 return(호출한곳으로 돌아감)이라 아래의 문장을 수행하지 않지만 finally는 무조건 수행한다
		}catch (ArithmeticException e) {
			System.out.println("0으로는 나눌수 없습니다.");
			//return;
		}finally {
			System.out.println("반드시 수행되는 문장");
			scan.close();  //스캐너 클래스를 사용하고 닫는 코드(오류가 나더라도 닫는다)
		}
		System.out.println("수고하셨습니다.");
	}
}
