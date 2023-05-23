package day13.com.ict.edu2;

import java.util.Random;
import java.util.Scanner;

public class Radom_RSP_main {
	public static void main(String[] args) {
//		랜덤 메서드를 이용한 1. 가위, 바위, 보 게임
//		- 공통사항 :  계속할까요(y/n)   사용
//        승률  구하기  (퍼센트) 
		Scanner scan = new Scanner(System.in);
		
		
//		int total = 0; // 전체판수
//		int w = 0; // 이긴수
		
		//String chk = "";
		Random_RSP1 rd = new Random_RSP1();
		esc:	
		while (true) {  //"n"일때 무한루프
			System.out.print("1.가위, 2.바위, 3.보 >> ");
			int i = scan.nextInt();
			
			Random ran = new Random();
			int r = ran.nextInt(3) + 1; // 1~3중에 랜덤값 출력

//		[묵찌빠 경우의 수]
//		이기는 경우 : com = 1 이고 user = 2 인 경우 / com = 2 이고 user = 3 인 경우
//					  com = 3 이고 user = 1 인경우
//		지는 경우   : com = 1 이고 user = 3 인 경우 / com = 2 이고 user = 1 인 경우
//		 			  com = 3 이고 user = 2 인경우
//		비기는 경우 : 이기는 경우와 지는 경우를 제외한 경우 => com 과 user가 같을 경우
			if (r == i) {
				System.out.println("무승부");
				rd.setTotal(); // 전체수만 증가
			} else if (r == 1 && i == 2 || r == 2 && i == 3 || r == 3 && i == 1) {
				System.out.println("승");
				rd.setTotal();
				rd.setW(); // 이긴수도 증가
			} else {
				System.out.println("패");
				rd.setTotal(); // 전체수만 증가
			}
			
//			//진행여부안내
			System.out.print("계속하시겠습니까? yes(Y/y), no(N/n) "); 
			String chk = scan.next();
			
			if (chk.equalsIgnoreCase("n")) {  
//		//승률구하기
				double per = ((int)(rd.getW()*10000.0/rd.getTotal())/100.0);
				System.out.println("승률은 "+per+"% 입니다.");
				break;
			}else if(chk.equalsIgnoreCase("y")) {
				
			}else {//n,y 둘중에 값을 받을때까지 무한 루프
				
					while (true) {
					System.out.println("n,y중 다시 입력해주세요");
					chk = scan.next();
					if (chk.equalsIgnoreCase("n")) {
						break esc;
					}else if(chk.equalsIgnoreCase("y")) {
						continue esc;
					}
				}
			}
		}
		
		
	}

}
