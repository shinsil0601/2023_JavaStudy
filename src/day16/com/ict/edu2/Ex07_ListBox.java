package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Ex07_ListBox extends JFrame{
	public Ex07_ListBox() {
		super("리스트박스");
		
		JPanel jp = new JPanel();
		
		String[] items = {"좋아하는 운동","야구","축구","배구","농구"};
		JList<String> jlist = new JList<>(items);
		
		jlist.setSelectedIndex(2);  //배열의 인덱스값을 넣으면 해당하는 배열인덱스의 내용이 먼저 보여짐
		
		jp.add(jlist);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-300, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex07_ListBox();
	}
}
