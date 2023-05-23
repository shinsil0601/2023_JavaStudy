package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class HomeWork_Calc2 extends JFrame{
	public HomeWork_Calc2() {
		super("계산기");
		
		JPanel tp = new JPanel();
		JPanel bp = new JPanel();
		
		bp.setLayout(new GridLayout(5,3,5,5));
		
		JTextField jtf1 = new JTextField(20);
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb0 = new JButton("0");
		JButton jba = new JButton("+");
		JButton jbb = new JButton("-");
		JButton jbc = new JButton("*");
		JButton jbd = new JButton(" / ");
		JButton jbe = new JButton("=");
		
//		패널에 담자
		tp.add(jtf1);
		bp.add(jb1);
		bp.add(jb2);
		bp.add(jb3);
		bp.add(jb4);
		bp.add(jb5);
		bp.add(jb6);
		bp.add(jb7);
		bp.add(jb8);
		bp.add(jb9);
		bp.add(jb0);
		bp.add(jba);
		bp.add(jbb);
		bp.add(jbc);
		bp.add(jbd);
		bp.add(jbe);
		
		add(tp, BorderLayout.NORTH);
		add(bp, BorderLayout.CENTER);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-125,ds.height/2-200,250,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new HomeWork_Calc2();
	}
}
