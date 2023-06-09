package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.BufferOverflowException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

public class Ex05_File_save extends JFrame{
	JPanel jp;
	JTextField jtf;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb;
	public Ex05_File_save() {
		super("저장하기");
		
		jp = new JPanel();
		jtf = new JTextField(15);
		jb = new JButton("SAVE");
		
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
				f_save();
			}
		});
		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f_save();
			}
		});
		jtf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				FileDialog fd = new FileDialog((Frame)getParent(), "저장하기", FileDialog.SAVE);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				if (! msg.equals("nullnull")) {
					jtf.setText(msg);
				}
			}
		});
	}
	// jb, jtf의 같은 값 실행을 위해 메서드를 만들어준다.
	private void f_save() {
		String pathname = jtf.getText().trim();
		if (pathname.length() > 0) {  // 입력값이 있을때만 실행함
			File file = new File(pathname);
			FileOutputStream fos = null;
			BufferedOutputStream bos = null;
			try {
				fos = new FileOutputStream(file, true);
				bos = new BufferedOutputStream(fos);
				
				String msg = jta.getText().trim();
				bos.write(msg.getBytes());
				bos.flush();
			} catch (Exception e) {
			}finally {
				try {
					bos.close();
					fos.close();
				} catch (Exception e2) {
				}
			}
		}
	}
	public static void main(String[] args) {
		new Ex05_File_save();
	}
}
