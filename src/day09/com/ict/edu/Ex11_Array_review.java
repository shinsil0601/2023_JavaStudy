package day09.com.ict.edu;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_Array_review {

	public static void main(String[] args) {
//		숙제
//		double p1 => 번호/국어/영어/수학/총점/평균/학점(char)/순위
//		double p2 => 번호/국어/영어/수학/총점/평균/학점(char)/순위
//		double p3 => 번호/국어/영어/수학/총점/평균/학점(char)/순위
		
		int[][] arr = new int[5][5];
//				   번호 총점 평균 학점 순위
		int[] p1 = {1 , 270 , 90 , 'A' , 1};
		int[] p2 = {2 , 210 , 70 , 'C' , 1};
		int[] p3 = {3 , 180 , 60 , 'F' , 1};
		int[] p4 = {4 , 300 , 100 , 'A' , 1};
		int[] p5 = {5 , 285 , 95 , 'A' , 1};
		
//		배열을 다차원 배열에 넣음
		arr[0] =p1;
		arr[1] =p2;
		arr[2] =p3;
		arr[3] =p4;
		arr[4] =p5;
		
//		순위를 구하자
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;  //자기자신 제외
				if (arr[i][1] < arr[j][1]) {  //비교하는 총점이 다른총점보다 작으면 
					arr[i][4] += 1;   //순위값을 증가시킴
				}
			}
		}
//		다차원"배열" 자리바꾸기 위한 임시배열
		int[] tmp = new int[5];
		
//		순위로 오름차순 정렬
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i][4] > arr[j][4]) {   //부등호방향 오름차순
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
//		오름차순 정렬 기준으로 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j==3) {
					System.out.printf("%3c ",arr[i][j]);
				}else {
				System.out.printf("%3d ",arr[i][j]);
				}
			}
			System.out.println();
		}
		
	}

}
