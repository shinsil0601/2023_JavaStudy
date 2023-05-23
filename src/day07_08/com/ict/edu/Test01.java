package day07_08.com.ict.edu;

public class Test01 {

	public static void main(String[] args) {
//		1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) 값을 구하시오
//		for문 + if ~ else문 사용
		int sum=0;
		for(int i = 1; i<11; i++) {
			if(i%2==0) {
				sum = sum + (i*-1);
			}else {
				sum= sum + i;
			}
		}
		System.out.println(sum);
		System.out.println("================");
		
//		농구공 5개씩 한박스에 들어간다. 40개면 8상자, 26개면 6상자이다.  ★★중요!!
//		int k1 = 127개 이다.
//		몇상자가 필여한가?  (if ~ else문 이용)
		int k1 = 127;
		int res = k1 /5;
		if (k1 % 5 != 0) {
			res = res +1;
		}
		System.out.println(res);
		System.out.println("========방법1========");
		
//		for문으로 풀기
//		0 0 0 0
//		0 0 0 0
//		0 0 0 0
//		0 0 0 0
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println("========방법2========");
		
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println("==================");
		
//		이중for문으로 풀기
//		1  0  0  0   
//		0  1  0  0
//		0  0  1  0
//		0  0  0  1
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print("1 ");
				} else		//else 를 안붙이면 밑에 "0"도 같이 출력됨
					System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println("==================");
		
//		1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) 과 같은식으로 계속 더해갔을때,
//		몇까지 더해야 총합이 100이상 되는지 구하시오  (for문)
		sum = 0;
		int cnt=0;
		for (int i = 1; sum < 1000; i++) {
			if (i % 2 == 0) {
				sum = sum + (i*-1);
			} else {
				sum = sum + (i*1);
			}
				cnt =i;
			if (sum>=100) {
				break;
			}
		}
			System.out.println(cnt);
		System.out.println("=======while문=======");
		sum = 0;
		cnt=0;
		int i =0;
		while (true) {
			if (i % 2 == 0) {
				sum = sum + (i *-1);
			} else {
				sum = sum + (i *1);
			}
				cnt =i;
			if (sum>=100) {
				break;
			}
			i++;
		}
			System.out.println(cnt);
		
	}

}
