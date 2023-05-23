package day13.com.ict.edu2;

import java.util.Random;
import java.util.Scanner;

public class Random_LowHigh_main {
	public static void main(String[] args) {
//		배열값을 입력받기
//		
		Random_LowHigh lh = new Random_LowHigh();
		
		Scanner scan = new Scanner(System.in);
		
		Random ran = new Random();
		
		esc:
		while(true) {
			int r = ran.nextInt(10)+1;
			
			while(true) {
				System.out.print("1~10까지의 아무숫자를 입력해주세요");
				int su = scan.nextInt();
				if(su<=0 || su > 10){
					System.out.println("다시 입력하세요.");
				}else {
					lh.setTotal();
					if (r == su) {  //com이랑 같을때
						System.out.println(r +"!! 정답입니다");
						System.out.println("총" + lh.getTotal() + "회 시도했습니다.");
						 lh.setW();
						 lh.setInit();  //판수당 갯수 초기화
						 
						 break;
					} else if (r > su) {
						System.out.println(su +" 보다 높음");
						continue;
					} else {
						System.out.println(su +" 보다 낮음");
						continue;
					}
				}
			}
			
			while(true) {
				System.out.print("계속 진행하시겠습니까? y/n >> \n");
				String i = scan.next();
				
				if (i.equalsIgnoreCase("y")) {
					continue esc;
				} else if (i.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.print("y or n값만 입력해주세요. >>\n");
				}
			}
			
		}
		
	}
}
