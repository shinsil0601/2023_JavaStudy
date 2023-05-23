package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ex10_Green extends JPanel{
	public Ex10_Green() {
		setBackground(Color.GREEN);
		
		JCheckBox jch1 = new JCheckBox(" + ");
		JCheckBox jch2 = new JCheckBox(" - ");
		JCheckBox jch3 = new JCheckBox(" * ");
		JCheckBox jch4 = new JCheckBox(" / ");
		
		add(jch1);
		add(jch2);
		add(jch3);
		add(jch4);
	}

}
