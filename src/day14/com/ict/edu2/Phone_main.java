package day14.com.ict.edu2;

public class Phone_main {
	public static void main(String[] args) {
//		전화로 알아보는 상속관계
//		생성자 객체 생성
		Mp3_Phone mp3 = new Mp3_Phone();
		mp3.call();
		mp3.sms();
		mp3.sound();
		System.out.println();
		
//		생성자 객체 생성
		DCa_Phone dca = new DCa_Phone();
		dca.call();
		dca.sms();
		dca.picture();
		
	}
}
