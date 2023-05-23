package day05.com.ict.edu;

public class Ex05_homework1 {
	public static void main(String[] args) {
//		1.농구공 5개씩 한박스에 들어간다.
//		40개면 8상자, 26개면 6상자이다.
//		int k1 = 127개 이다.
//		몇상자가 필여한가?  (if ~ else문 이용)
		int k1 = 127;
		int box = 0;
		if (k1 % 5 == 0) {
			box = k1 / 5;
		} else {
			box = k1 / 5 + 1;
		}
		System.out.println(box);
		System.out.println("==================");

//		2. for문으로 풀기
//		0 0 0 0
//		0 0 0 0
//		0 0 0 0
//		0 0 0 0
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println("==================");

//		3. 이중for문으로 풀기
//		1  0  0  0   
//		0  1  0  0
//		0  0  1  0
//		0  0  0  1
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i == j) {
					System.out.print("1 ");
				} else
					System.out.print("0 ");
			}

			System.out.println();
		}

		System.out.println("==================");

//		4. 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) 과 같은식으로 계속 더해갔을때,
//			몇까지 더해야 총합이 100이상 되는지 구하시오
		int sum = 0;
		int j=0;
		for (j = 1; sum < 100; j++) {
			if (j % 2 == 0) {
				sum = sum + -j;
			} else {
				sum = sum + j;
			}
		} System.out.println(j-1);

		System.out.println("==================");

//		5. 별찍기 -1 (for문 이용)
//		*
//		**
//		***
//		****
		for (int i = 1; i < 5; i++) {
			for ( j = 1; j <= i; j++) {
				System.out.print("*");
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
			for ( j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for ( j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
