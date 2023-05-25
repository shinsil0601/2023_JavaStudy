package day21.com.ict.edu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Main extends JFrame{
	JPanel pg1;
	CardLayout cardLayout;
	public Ex02_Main() {
		super("카드레이아웃2");
		
		pg1 = new JPanel();
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout);  //카드레이아웃으로 속성을 바꿔줌
		
		//메인메서드에서 객체생성하면 정보가 넘어감
		Ex02_Login login = new Ex02_Login(cardLayout, pg1);
		Ex02_Join join = new Ex02_Join(this);
		Ex02_Login_ok loginok = new Ex02_Login_ok(this);
		
		pg1.add("login", login); //★Keypoint 중요 첫화면에 보여주기
		pg1.add("join", join);
		pg1.add("loginok", loginok);
		
		add(pg1);
		
		//cardLayout.show(pg1, "loginok"); //카드화면을 먼저 보여줌
		setLocationRelativeTo(null);
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex02_Main();
	}
}
