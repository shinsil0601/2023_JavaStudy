package day15.com.ict.edu2;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("선택하세요(1.고양이  2.강아지)>> ");
			int su = scan.nextInt();

			
//			다형성의 정적바인딩 : 반복문 안에서 출력값을 정함
	/*		switch (su) {
			case 1:
				Ex04_cat cat = new Ex04_cat();  //정적바인딩
				cat.sound();
				cat.play();
				break;
			case 2:
				Ex04_dog dog = new Ex04_dog();
				dog.sound();
				dog.play();
				break;
			}*/
			
//			다형성의 동적바인딩 : 반복문 밖에서 출력값을 정함
			Ex04_abstract animal = null;
			switch (su) {
			case 1: animal = new Ex04_cat(); break;
			case 2: animal = new Ex04_dog(); break;
			}
			animal.sound();
			animal.play();
			
//			변경안됨
//			System. out.println(animal.name);
			
//			부모클래스를 선언했으므로 자식클래스만 가진 메서드는 사용 못함
			System.out.println(animal.getName());
			
			
		}
	}
}
