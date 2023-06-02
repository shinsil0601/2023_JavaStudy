package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//	입력과 출력 동시
//	D:/KSS/test01.txt 읽어서 D:/KSS/test02.txt 내용 추가하자
public class Ex03_File_IO {
	public static void main(String[] args) {
		String pathname1 = "D:/KSS/test01.txt";
		String pathname2 = "D:/KSS/test02.txt";
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			//읽기
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
			//쓰기
			fos = new FileOutputStream(file2,true);  //true 덮어쓰기
			bos = new BufferedOutputStream(fos);
			
			/*★아주중요★ 모든 파일의 복사, 이동은 해당 방식으로 해야한다*/
			int b = 0;
			while ((b=bis.read()) != -1) {
				bos.write(b);
			}
			
			/*내가한 코딩
			 //읽는 코딩
			byte[] b = new byte[(int) file1.length()];
			fis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			//쓰는 코딩
			byte[] arr = msg.getBytes();
			fos.write(arr);
			fos.flush();*/
		} catch (Exception e) {
		} finally {
			try {
				bos.close();
				fos.close();
				
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	
		
	}
}
