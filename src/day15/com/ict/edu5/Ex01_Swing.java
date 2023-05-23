package day15.com.ict.edu5;

import javax.swing.JFrame;
// JFrame
public class Ex01_Swing {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("Swing으로 만든 창");  //생성자로 만듬
//		JFrame jframe = new JFrame();  
//		Jframe.setTitle("Swing으로 만든 창");  //setter 로 값입력
		
		jframe.setSize(600, 600);  //창크기
		jframe.setLocation(0, 0);  //창위치
		
		
//		표시여부(기본: false)
		jframe.setVisible(true);
	}
	
}
