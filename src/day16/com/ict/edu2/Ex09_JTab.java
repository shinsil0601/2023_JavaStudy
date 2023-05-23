package day16.com.ict.edu2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class Ex09_JTab extends JFrame{
	public Ex09_JTab() {
		super("JTab");
		
//		XXXPane = 컨테이너 = 다른컨테이너를 가질수 있고, 컴포넌트도 가질 수 있다.
		JTabbedPane jtab = new JTabbedPane();
		
		JPanel jp1 = new JPanel();
//		배경색
		jp1.setBackground(Color.BLUE);
//		버튼
		JButton	jb1 = new JButton(" + ");
		JButton	jb2 = new JButton(" - ");
		JButton	jb3 = new JButton(" * ");
		JButton	jb4 = new JButton(" / ");
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		
//		버튼들을 jtab에 넣어줌
		jtab.addTab("블루 탭", jp1);
		
		JPanel jp2 = new JPanel();
//		패널에 대한 배경색
		jp2.setBackground(Color.CYAN);
		JRadioButton jrb1 = new JRadioButton(" + ");
		JRadioButton jrb2 = new JRadioButton(" - ");
		JRadioButton jrb3 = new JRadioButton(" * ");
		JRadioButton jrb4 = new JRadioButton(" / ");
//		버튼에 배경색 지정
		jrb1.setBackground(Color.CYAN);
		jrb2.setBackground(Color.CYAN);
		jrb3.setBackground(Color.CYAN);
		jrb4.setBackground(Color.CYAN);
		
		ButtonGroup bg = new ButtonGroup();  //중복선택 불가능
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
		jtab.addTab("시얀 탭", jp2);

		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.GREEN);
		
		JCheckBox jch1 = new JCheckBox(" + ");
		JCheckBox jch2 = new JCheckBox(" - ");
		JCheckBox jch3 = new JCheckBox(" * ");
		JCheckBox jch4 = new JCheckBox(" / ");
		jch1.setBackground(Color.GREEN);
		jch2.setBackground(Color.GREEN);
		jch3.setBackground(Color.GREEN);
		jch4.setBackground(Color.GREEN);
		
		jp3.add(jch1);
		jp3.add(jch2);
		jp3.add(jch3);
		jp3.add(jch4);
		jtab.addTab("오렌지 탭", jp3);
		
//		창에 활성화 시켜줌
		add(jtab);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-200, ds.height/2-200, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex09_JTab();
	}
}
