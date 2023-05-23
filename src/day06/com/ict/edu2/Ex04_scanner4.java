package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex04_scanner4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원하는 반복 횟수: ");
		int su = scan.nextInt();
		
		System.out.print("원하는 단어: ");
		String str = scan.next();
		
		System.out.println("=====for문======");
		for(int i=0; i<su; i++) {
			System.out.println(str);
		}
		
		System.out.println("=====while문======");
		int i =0;
		while (i<su) {
			System.out.println(str);
			i++;
		}
		
		
	}

}
