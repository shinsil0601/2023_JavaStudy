package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex06_File_open extends JFrame{
	JPanel jp;
	JTextField jtf;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb;
	public Ex06_File_open() {
		super("불러오기");
		
		jp = new JPanel();
		jtf = new JTextField(15);
		jb = new JButton("불러오기");
		
		jp.add(new JLabel("파일 경로 : "));
		jp.add(jtf);
		jp.add(jb);
		
		jta = new JTextArea(10,30);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);  //줄바꿈
		
		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f_open();
			}
		});
		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f_open();
			}
		});
		jtf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				FileDialog fd = new FileDialog((Frame)getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				if (! msg.equals("nullnull")) {
					jtf.setText(msg);
					f_open();
				}
			}
		});
	}
	// jb, jtf의 같은 값 실행을 위해 메서드를 만들어준다.
	private void f_open() {
		String pathname = jtf.getText().trim();
		if (pathname.length() > 0) {  // 입력값이 있을때만 실행함
			File file = new File(pathname);
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				
				byte[] b = new byte[(int)file.length()];
				bis.read(b);
				String msg = new String(b).trim();
				jta.setText(msg);  // 이어쓰려면 어팬드
			} catch (Exception e) {
			}finally {
				try {
					bis.close();
					fis.close();
				} catch (Exception e2) {
				}
			}
		}
	}
	public static void main(String[] args) {
		new Ex06_File_open();
	}
}
