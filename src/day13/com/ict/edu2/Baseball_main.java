package day13.com.ict.edu2;

import java.util.Random;
import java.util.Scanner;

public class Baseball_main {
	public static void main(String[] args) {
//		야구게임
//		10 회부터 계속할까요(y/n)   사용
//		몇번째에 만 맞춰는지 출력
		
//		컴퓨터가 랜덤으로 중복안되는 3자리의 수 출력
		Random ran = new Random();
		int[] com = new int[3];
		com[0] = ran.nextInt(10);
		com[1] = ran.nextInt(10);
		
		
//		첫번째 두번째 중복값 제외
		while(com[0] == com[1]) {  //인덱스 0과 1에 저장된 숫자가 같으면 1번인덱스의 값을 다시 돌린다.
			com[1] = ran.nextInt(10);
		}
		
//		세번째 자리 중복제외
		com[2] = ran.nextInt(10);
		while(com[0] == com[2] || com[1] == com[2]) {  //인덱스 0과 1에 저장된 숫자가 같으면 1번인덱스의 값을 다시 돌린다.
			com[2] = ran.nextInt(10);
		}
		System.out.println(com[0] + " " + com[1] + " " + com[2]);
		
////		com의 랜덤 숫자 3개 출력
//		for (int i = 0; i < com.length; i++) {
//			System.out.print(com[i]+ " ");
//		}
		int count = 0;  //총 횟수
		while(true) {  //컴퓨터 값과 일치하거나 다르거나 비교
			count ++;
//		사용자가 입력하는 3자리 중복 안되는 수 입력
//		중복시 안내 멘트 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("0~9 사이의 숫자를 입력하세요(첫번째)>> ");
		
		int[] user = new int[3];
		
//		//인덱스 0번째에 0~9의 값 입력 아닐시 멘트출력
		user[0] = scan.nextInt();
		while(user[0] < 0 || user[0] >9) {
			System.out.print("0~9 사이의 값을 '다시' 입력해주세요(첫번째)>> ");
			user[0] = scan.nextInt(); //입력값 다시 받기
		}
		
		System.out.print("0~9 사이의 숫자를 입력하세요(두번째)>> ");
		user[1] = scan.nextInt();
		while(user[0] == user[1] || (user[1] < 0 || user[1] >9)) {
			System.out.print("0~9 사이의 숫자를 '다시' 입력하세요(두번째)>> ");
			user[1] = scan.nextInt();
		}
		
		System.out.print("0~9 사이의 숫자를 입력하세요(세번째)>> ");
		user[2] = scan.nextInt();
		while((user[0] == user[2] || user[1] == user[2]) || (user[2] < 0 || user[2] >9)) {
			System.out.print("0~9 사이의 숫자를 '다시' 입력하세요(세번째)>> ");
			user[2] = scan.nextInt();
		}
		int strike = 0;
		int ball = 0;
//		com의 값과 user의 값 비교
		for (int i = 0; i < user.length; i++) {
			if (user[i]==com[i]) {
				strike ++;
			} else {  //스트라이크가 아닐떄 조건문
				for (int j = 0; j < user.length; j++) {
					if (user[i]==com[j]) {
						ball++;
					}
				}
			}
		}
//		  결과값 안내
		if (strike == 3) {
			System.out.println("홈런입니다."); break;
		} else if(strike==0 && ball == 0){
			System.out.println("아웃입니다.");
		}else {
		System.out.println(strike+" 스트라이크, "+ ball + " 볼");
		}
//		계속 게임할지 여부
		if (count%10 == 0) {
			System.out.print("게임을 계속 진행 하시겠습니까>> y / n");
			String res=scan.next();
			if (res.equalsIgnoreCase("y")) {
				
			} else if(res.equalsIgnoreCase("n")){
				break;
			}else {
				System.out.println("n,y중 다시 입력해주세요");
			}
		}
		}
		System.out.println("야구게임을 종료합니다.");
	}
}
