package day27.com.ict.edu;

import java.io.File;
import java.io.FileReader;

//	FileInputStream => 1byte, read() => 아스키코드(숫자), read(byte[] b)
//	FileReader		=> 2byte, read() => 유니코드(숫자), read(char[] b)
public class Ex05_reder {
	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			String pathname = "D:/KSS/ex01.txt";
			fr = new FileReader(pathname);
			
			// 한 글자 읽기
			/*int k = fr.read();
			System.out.println(k + " : " + (char)(k));*/  // 해당파일의 한글자만 출력
			
			//반복문을 이용한 전체 읽기
			/*int k = 0;
			while ((k=fr.read()) != -1) {
				System.out.println(k + " : " + (char)(k));
			}*/
			
			// 배열로 읽기
			/*File file = new File(pathname);
			char[] c =new char[(int)file.length()];
			// c 배열에 모든 정보가 저장됨
			fr.read(c);
			for (char k : c) {
				System.out.println(k + " : " + (char)(k));
			}*/
			
			// String이용해 읽기
			File file = new File(pathname);
			char[] c =new char[(int)file.length()];
			fr.read(c);
			String msg = new String(c).trim();
			System.out.println(msg);
			
		} catch (Exception e) {
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
