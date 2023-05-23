package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex10_Cyan extends JPanel{
	public Ex10_Cyan() {
		setBackground(Color.CYAN);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton(" + ");
		JRadioButton jrb2 = new JRadioButton(" - ");
		JRadioButton jrb3 = new JRadioButton(" * ");
		JRadioButton jrb4 = new JRadioButton(" / ");
		
		add(jrb1);
		add(jrb2);
		add(jrb3);
		add(jrb4);
	}

}
