package day13.com.ict.edu2;

public class Random_LowHigh {

	private int total = 0;  //판수
	private int w = 0;  //승
	private int init = 0;  //판수당 갯수 초기화
	
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total++;
	}
	public int getW() {
		return w;
	}
	public void setW() {
		this.w++;
	}
	public int getInit() {
		return init;
	}
	public void setInit() {
		this.total = this.init;
	}
	
	
}
