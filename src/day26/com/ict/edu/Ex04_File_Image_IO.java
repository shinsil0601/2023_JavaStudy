package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//입력과 출력 동시
//D:/KSS/java1.png 읽어서 D:/KSS/util/java1.png 쓰기(복사)
public class Ex04_File_Image_IO {
	public static void main(String[] args) {
		String pathname1 = "D:/KSS/java1.png";
		String pathname2 = "D:/KSS/util/java1.png";
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
