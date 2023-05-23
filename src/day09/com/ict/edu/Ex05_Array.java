package day09.com.ict.edu;

public class Ex05_Array {

	public static void main(String[] args) {
		String[] name = {"홍","김","이","박","고",};
		int[] kor = {80,90,80,70,100};
		int[] eng = {85,95,75,85,95};
		int[] math = {100,95,90,100,100};
		
		int[] sum = new int [name.length];  
		double[] avg = new double [name.length];  
		String[] hak = new String [name.length];  
		int[] rank = {1,1,1,1,1};  
		
//		for문을 이용해서 반복처리한다.
		for (int i = 0; i < name.length; i++) {   //순위 정렬은 반복문이 돌아가는 동안 sum의 값이 다 안나오므로 못함
			sum[i] = kor[i] + eng [i] + math[i];
			avg[i] = (int)(sum[i] / 3.0 *10) / 10.0 ;
			if (avg[i]>=90) {
				hak[i] = "A학점";
			}else if(avg[i]>=80) {
				hak[i] = "B학점";
			}else if(avg[i]>=70) {
				hak[i] = "C학점";
			}else {
				hak[i] = "F학점";
			}
		}
//		순위를 구하자 (sum값으로 비교!!)
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name.length; j++) {
				if (i == j) continue; 
				if(sum[i] < sum[j]) {
						rank[i]++;
					}
			}
		}
		
//		출력
		System.out.println("이름 총점  평균   학점  순위");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"   ");
			System.out.print(sum[i]+"   ");
			System.out.print(avg[i]+"   ");
			System.out.print(hak[i]+"   ");
			System.out.println(rank[i]);
		}
		System.out.println();
		
		
		
	}

}




