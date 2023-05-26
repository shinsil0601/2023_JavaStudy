package day22.com.ict.edu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Ex05_Main extends JFrame{
	Ex05_Canvas canvas = new Ex05_Canvas();
	
	
	public Ex05_Main() {
		super("내맘대로 원찍기");
		
		add(canvas);
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// 마우스 이벤트
		// ItemListener, ActionListener처럼 오버라이딩 메서드가 하나가 아니라
		// 2개 이상이면 불필요한 메서드까지 오버라이딩하게 된다.
		// 이러한 단점을 고친 Adapter()이다
		/*canvas.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}
		});*/
		canvas.addMouseListener(new MouseAdapter() {  //이걸 많이 씀
			@Override
			public void mouseClicked(MouseEvent e) {
				canvas.x = e.getX(); //마우스 찍히는 좌표를 캔버스로 보냄
				canvas.y = e.getY();
				canvas.repaint();
				
			}
		});
	}
	public static void main(String[] args) {
		new Ex05_Main();
	}
}
