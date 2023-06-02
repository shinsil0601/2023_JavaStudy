package day28.com.ict.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

//PrintStream : 1byte 처리, 모든 데이터 출력할 수 있음.(System.out.println())
//BufferedStream 처럼

//PrintWriter : OutputStream(바이트), Write(문자출력) 둘다 사용 가능


public class Ex01_printwriter {
	public static void main(String[] args) {
		String pathname = "D:/KMJ/exam100.txt";
		File file = new File(pathname);

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
// 체인방식
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);

			pw.println("PrintWriter 연습");
			pw.print(123456);
			pw.println('A');
			pw.print(true);
			pw.print(178.95);

		} catch (Exception e) {
		} finally {
			try {
				pw.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {

			}
		}
	}
}
