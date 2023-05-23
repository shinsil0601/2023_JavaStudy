package day09.com.ict.edu;

import java.util.Arrays;
import java.util.Collections;

public class Ex03_Array {

	public static void main(String[] args) {
//		정렬하기(오름,내림차순)
		int[] su = {3,4,9,8,2,1,7,10,5,6};
		
//		자리변경을 위한 임시 변수 필요
		int temp = 0;
		for (int i = 0; i < su.length-1; i++) {   //'정렬'일때: 비교할값은 돌아가는 값보다 작아도 되니까 su.length-1 
			for (int j = i+1; j < su.length; j++) {  //j는 i의 비교대상이므로 i+1부터 시작한다
//				비교하기: 오름(i>j),  내림(i<j) 일때 자리 변경하자
				if (su[i] > su[j]) {  //오름차순
					temp = su[i];
					su[i] = su[j];
					su[j] = temp;
				} 
			}
		}
		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i]+" ");
		}
		System.out.println("\n======================");
		
		for (int i = 0; i < su.length-1; i++) {   
			for (int j = i+1; j < su.length; j++) {  
//				비교하기: 오름(i>j),  내림(i<j) 일때 자리 변경하자
				if (su[i] < su[j]) {  //내림차순
					temp = su[i];
					su[i] = su[j];
					su[j] = temp;
				} 
			}
		}
		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i]+" ");
		}
		System.out.println("\n======================");
		
		int[] su2 = {3,4,9,8,2,1,7,10,5,6};
		
//		Arrays 클래스는 배열 복사, 정렬, List로 전환 등
//		배열에 관련된 기능을 제공하는 클래스
//		오름차순 정렬은 sort() 메서드로 가능
//		내림차순은 없음
		
		Arrays.sort(su2);
		for (int i = 0; i < su2.length; i++) {
			System.out.print(su2[i]+" ");
		}
		System.out.println("\n======================");
		
//		int[] su3 = {3,4,9,8,2,1,7,10,5,6};   //기본자료형으로 오류남
		Integer[] su3 = {3,4,9,8,2,1,7,10,5,6};  //밑에 사용되는 Collections 클래스가 참조자료형으로 Integer로 쓴다!!
		Arrays.sort(su3, Collections.reverseOrder());  
		for (int i = 0; i < su3.length; i++) {
			System.out.print(su3[i]+ " ");
		}
		
		
		
		
	}

}






