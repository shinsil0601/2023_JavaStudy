package day25.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//	Ex04의 속도 향상을 위해서 BufferedOutStream 사용
//	BufferedOutStream는 혼자서 사용하지 않는다. 반드시 OutputStream중 하나와 같이 사용 된다.
public class Ex05_Buffered {
	public static void main(String[] args) {
		String pathname = "D:/KSS/test02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			String msg = "안녕\nHello\n大韓\n123456";
			
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();  //bos 닫고-> fos닫는 순으로 작성
				fos.close();
			} catch (IOException e2) {
			}
		}
	}
}
