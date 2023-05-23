package day15.com.ict.edu3;
// ★ 중요
//	추상클래스, 인터페이스를 부모클래스로 가지고 있다.(순서: extends, implements)
public class Ex02_calc extends Ex02_Oper implements Ex02_add, Ex02_sub{

	@Override
	public double minus(double s1, double s2) {
		return s1 -s2;
	}

	@Override
	public double plus(double s1, double s2) {
		return s1+s2;
	}

	@Override
	public double mul(double s1, double s2) {
		return s1*s2;
	}

	@Override
	public double div(double s1, double s2) {
		return s1/s2;
	}

}
