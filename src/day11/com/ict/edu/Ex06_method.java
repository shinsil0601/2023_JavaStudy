package day11.com.ict.edu;

public class Ex06_method {
	
//	총점을 구하는 총점 리턴하는 메서드
	public int getSum(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
	}
//	평균을 구하는 평균 리턴하는 메서드
	public double getAvg(int sum) {
		double avg = (int)(sum/3.0*10)/10;
		return avg;
	}
	/* 이렇게 작성해도 됨
	public double getAvg(int kor, int eng, int math) {
		double avg = (int)((kor+eng+math)/3.0*10)/10;
		return avg;
	}*/
	
//	학점을 구하는 학점 리턴하는 메서드
	public String getHak(double avg) {
		String hak="";  //조건문안에 변수선언을 하면 사라지기때문에 밖에 선언함
		if (avg >= 90) {
			hak = "A";
		} else if (avg >= 80) {
			hak = "B";
		} else if (avg >= 70){
			hak = "C";
		}else {
			hak = "F";
		}
		return hak;
	}
	
	/*이렇게 작성해도 됨
	 public String getHak(int kor, int eng, int math) {
	 	double avg = (int)((kor+eng+math)/3.0*10)/10;
		String hak="";  //조건문안에 변수선언을 하면 사라지기때문에 밖에 선언함
		if (avg >= 90) {
			hak = "A";
		} else if (avg >= 80) {
			hak = "B";
		} else if (avg >= 70){
			hak = "C";
		}else {
			hak = "F";
		}
		return hak;
	}
	 */
}
