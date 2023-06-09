package day27.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Homework_DB extends JFrame{
	JPanel jp1,jp2;
	JTextField jtf1,jtf2,jtf3,jtf4;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public Homework_DB() {
		super("DB 연동 정보");
		
		jp1 = new JPanel();
		jp1.add(new JLabel("           CUSTID : "));
		jtf1= new JTextField(20);
		jp1.add(jtf1);
		jp1.add(new JLabel("             NAME : "));
		jtf2= new JTextField(20);
		jp1.add(jtf2);
		jp1.add(new JLabel("           ADDRESS :"));
		jtf3= new JTextField(20);
		jp1.add(jtf3);
		jp1.add(new JLabel("            PHONE : "));
		jtf4= new JTextField(20);
		jp1.add(jtf4);
		
		jta = new JTextArea(15,0);
		jta.setLineWrap(true);
		jta.setEditable(true);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		jp2 =  new JPanel();
		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton("불러오기");
		jb6 = new JButton("고치기");
		jb6.setEnabled(false);
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		
		jp1.setLayout(new GridLayout(4,0));
		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Homework_DB();
	}
}
