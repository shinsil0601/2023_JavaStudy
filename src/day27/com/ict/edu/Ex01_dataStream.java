package day27.com.ict.edu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//	DataInputStream 과 DataOutputStream
//	기본자료형의 데이터를 주고 받을때 사용
//	** 반드시 입력순서와 출력순서를 맞춰야 한다.**
//	기본생성자가 없어서 BufferedStream 처럼 FileStream를 이용해야한다.
public class Ex01_dataStream {
	public static void main(String[] args) {
		String pathname = "D:/KSS/test03.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// writeXXX() =>XXXX는 기본자료형을 말한다.
			dos.writeChar(97);
			dos.writeChar('A');
			dos.writeInt(245);
			dos.writeDouble(178.95);
			dos.writeBoolean(false);
			dos.writeChar('가');  //한글은 깨짐
			dos.writeChar(97);
			dos.writeChar('A');
			dos.flush();
			
			//readXXX() => XXX는 기본자료형이다.
			// 반드시 쓰기 순서대로 읽어야 함
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
		} catch (Exception e) {
		}finally {
			try {
				dis.close();
				fis.close();
				dos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
