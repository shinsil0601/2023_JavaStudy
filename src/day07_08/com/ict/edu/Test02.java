package day07_08.com.ict.edu;

public class Test02 {

	public static void main(String[] args) {
//		5. 별찍기 -1 (for문 이용)
//		*
//		**
//		***
//		****
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) { // 별이 i만큼 찍힘
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==================");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) { // 별이 i만큼 찍힘
				System.out.print("*");
				if (i == j)
					break;
			}
			System.out.println();
		}
		System.out.println("==================");

//		6. 별찍기 -2 (for문 이용)
//		   *
//		  **
//		 ***
//		****
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("==================");
		
	}

}
