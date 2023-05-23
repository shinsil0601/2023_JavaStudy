package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class HomeWork_Calc1 extends JFrame{
//	계산기 만들기
	public HomeWork_Calc1() {
		super("계산기");
		
		JPanel np = new JPanel();
		JTextField jtf1 = new JTextField(5);
		JTextField jtf2 = new JTextField(5);
		String[] items = {"선택하세요","+","-","*","/"};
		JComboBox<String> jcom = new JComboBox<>(items);
		
//		패널에 담자
		np.add(new JLabel("수1: "));
		np.add(jtf1);
		np.add(new JLabel("수2: "));
		np.add(jtf2);
		np.add(new JLabel("연산자: "));
		np.add(jcom);
		
		add(np,BorderLayout.NORTH);
		
		JTextArea jta = new JTextArea();  //패널 안만듬
		
//		편집 불가능하게 만들자
		jta.setEditable(false);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		jta.setLineWrap(true);  //자동 줄바꾸기
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		add(np,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250,ds.height/2-250,500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new HomeWork_Calc1();
	}
}
