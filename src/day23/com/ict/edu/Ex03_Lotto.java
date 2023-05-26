package day23.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_Lotto extends JFrame{
	JPanel jp;
	JButton jb;
	Image[] images = new Image[45];
	CanvasTest canvas = new CanvasTest();
	
	public Ex03_Lotto() {
		super("로또 자동 생성기");
		
		jp = new JPanel();
		jb = new JButton("번호 생성");
		jp.add(jb);
		add(jp, BorderLayout.EAST);
		add(canvas, BorderLayout.CENTER);
		
		setSize(900,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.repaint();
			}
		});
	}
	//캔버스 내부클래스
	private class CanvasTest extends Canvas{
		public CanvasTest() {  //기본생성자 만들어줌
			// 배열에 이미지 (1:1매칭)
			for (int i = 0; i < images.length; i++) {
				images[i] = Toolkit.getDefaultToolkit().getImage("src/lotto_img/"+ (i+1) +".gif");  //(i+1)->인덱스값과 사진번호의 값이 다르기 때문에
			}
		}
		@Override
		public void paint(Graphics g) {
			int[] su = new int[6];
			TreeSet<Integer> set = new TreeSet<>();
			for (int i = 0; i < su.length; i++) {
				int k = (int)((Math.random()*45)+1);
				if(! set.add(k)) { //중복값에 대한 조건식
					i--;
				}
			}
			System.out.println(set);
			
			int num = 0;
			for (Integer k : set) {
				g.drawImage(images[k-1], num++*120, 25, this);  // num++*120->처음은 0*120 다음에 옆에 나올수있게 반복문
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex03_Lotto();
	}
}
