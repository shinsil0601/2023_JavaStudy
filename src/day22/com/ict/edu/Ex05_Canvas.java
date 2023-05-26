package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ex05_Canvas extends Canvas{
	int x = -50, y = -50;
	int wh = 30;
	@Override
	public void paint(Graphics g) {
		//색깔 지정 랜덤 255가지
		int r1 = (int)(Math.random()*256);
		int g1 = (int)(Math.random()*256);
		int b1 = (int)(Math.random()*256);
		g.setColor(new Color(r1,g1,b1));
		g.fillOval(x-wh/2, y-wh/2, wh, wh);  // x,y(마우스 찍히는 위치값), wh(넓이,높이)
	}
//	캔버스에 기존내용을 그대로 남겨두고 추가하자
	@Override
	public void update(Graphics g) {
		paint(g);
	}
}
