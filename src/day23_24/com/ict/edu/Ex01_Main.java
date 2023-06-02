package day23_24.com.ict.edu;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Ex01_Main extends JFrame{
	Ex01_Canvas canvas = new Ex01_Canvas();
	public Ex01_Main() {
		super("키 이벤트로 이미지 움직이기");
		
		add(canvas);
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		/*addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
		});*/
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//눌려진 키 값을 구하자
				int key = e.getKeyCode();
				switch (key) {
				case KeyEvent.VK_LEFT:
					if(canvas.x<=0) {  //그림이 캔버스(왼쪽) 밖으로 나가지 못하게 조건식을 줌
						canvas.x=0;
					}
					canvas.x = canvas.x - 10;
					break;
				case KeyEvent.VK_RIGHT:
					if(canvas.x>=canvas.getWidth()-100) {  //그림이 캔버스넓이(오른쪽)밖으로 나가지 못하게 조건식을 줌
						canvas.x=canvas.getWidth()-100;
					}
					canvas.x = canvas.x + 10;
					break;
				}
				canvas.repaint();
			}
		});
	}
	public static void main(String[] args) {
		new Ex01_Main();
	}
}
