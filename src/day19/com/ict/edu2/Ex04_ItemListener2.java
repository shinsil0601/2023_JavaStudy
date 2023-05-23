package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

//	JCheckBox, JRadioButton, JToggleButton => ItemListener
public class Ex04_ItemListener2 extends JFrame{
	JPanel jp1,jp2;
	JCheckBox jch1,jch2,jch3,jch4;
	JButton jb1, jb2;
	JTextArea jta;
	JScrollPane jsp;
	public Ex04_ItemListener2() {
		super("체크박스 이벤트 처리");
		jp1 = new JPanel();
		jch1 = new JCheckBox("축구");
		jch2 = new JCheckBox("야구");
		jch3 = new JCheckBox("농구");
		jch4 = new JCheckBox("배구");
		
		jp1.add(jch1);
		jp1.add(jch2);
		jp1.add(jch3);
		jp1.add(jch4);
		
		jta = new JTextArea(10,0);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		jp2 = new JPanel();
		jb1 = new JButton("exit");
		jb2 = new JButton("clear");
		
		jp2.add(jb1);
		jp2.add(jb2);
		
		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);
		
		pack(); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
//		체크박스는 ItemListener를 달자
		jch1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {  //e.getStateChange()선택값 변화
					jta.append(jch1.getText()+"선택\n");
				} else if (e.getStateChange() == e.DESELECTED) {
					jta.append(jch1.getText()+"해제\n");
				}
			}
		});
		jch2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {  //e.getStateChange()선택값 변화
					jta.append(jch2.getText()+"선택\n");
				} else if (e.getStateChange() == e.DESELECTED) {
					jta.append(jch2.getText()+"해제\n");
				}
			}
		});
		jch3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {  //e.getStateChange()선택값 변화
					jta.append(jch3.getText()+"선택\n");
				} else if (e.getStateChange() == e.DESELECTED) {
					jta.append(jch4.getText()+"해제\n");
				}
			}
		});
		jch4.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {  //e.getStateChange()선택값 변화
					jta.append(jch4.getText()+"선택\n");
				} else if (e.getStateChange() == e.DESELECTED) {
					jta.append(jch4.getText()+"해제\n");
				}
			}
		});
		
//		버튼을 addActionListener를 달자
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					System.exit(0);
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jch1.setSelected(false);
				jch2.setSelected(false);
				jch3.setSelected(false);
				jch4.setSelected(false);
				jta.setText("");
			}
		});
	}
	
//	ActionListener 해결하는 추상메서드(버튼)

	public static void main(String[] args) {
		new Ex04_ItemListener2();
	}
}
