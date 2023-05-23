package day13.com.ict.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex07_LocalDate {
	public static void main(String[] args) {
//		java version 1.8이상만 가능
//		LocalDate : 날짜 정보만 필요할때
//		LocalTime : 시간 정보만 필요할때
//		LocalDate : 날짜, 시간 모두 필요할때
		
		LocalDate cDate = LocalDate.now();
		System.out.println("-- 날짜 --");
		System.out.println(cDate);
		System.out.println("getYears() : "+ cDate.getYear());  //년도
		System.out.println("getMonth() : "+ cDate.getMonth());  //월(MAY)
		System.out.println("getMonthValue() : "+ cDate.getMonthValue());  //월(1,2,3...)
		System.out.println("getDayOfYear() : "+ cDate.getDayOfYear());  //년의 몇번째 일
		System.out.println("getDayOfMonth() : "+ cDate.getDayOfMonth());  //일
		System.out.println("getDayOfWeek() : "+ cDate.getDayOfWeek());  //요일(MONDAY)
		System.out.println("isLeapYear() : "+ cDate.isLeapYear());  //윤년여부(boolean) =>boolean형은 is로 시작한다
		System.out.println();
		
		LocalTime cTime = LocalTime.now();
		System.out.println("-- 시간 --");
		System.out.println(cTime);
		System.out.println("getHour() : "+ cTime.getHour());  //년도
		System.out.println("getMinute() : "+ cTime.getMinute());  //월(MAY)
		System.out.println("getSecond() : "+ cTime.getSecond());  //월(1,2,3...)
		//1970년 1월 1일 0분 0시 0초 (UTC의 첫번째 순간 이후 현재 시간까지의 나노초를 나타내는 값)
		System.out.println("getNano() : "+ cTime.getNano());  //년의 몇번째 일
		System.out.println();
		
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);
		System.out.println();
		
		System.out.println(cDate.format(DateTimeFormatter.BASIC_ISO_DATE)); //년월일
		System.out.println(cdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));  //년-월-일
		System.out.println(cdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));  //년-월-일 시:분:초
		System.out.println();
		
		System.out.println("-- 날짜차이비교 --");
		LocalDate sDate = LocalDate.now();
		LocalDate eDate = LocalDate.EPOCH.of(2024, 06, 10);
		Period period = Period.between(sDate, eDate);  //날짜 차이비교
		System.out.println("년: " + period.getYears());  //sDate와 eDate 년 비교 : 1
//		//잘안씀
		System.out.println("월: " + period.getMonths());  //sDate와 eDate 년 비교 : 0
		System.out.println("일: " + period.getDays());  //sDate와 eDate 년 비교 : 26
		System.out.println("일: " + ChronoUnit.DAYS.between(sDate, eDate));  //일자로 비교 ★많이 사용
		System.out.println();
		
		System.out.println(sDate.plusYears(2));
		System.out.println(sDate.plusMonths(2));
		System.out.println(sDate.plusDays(100));
		
		
	}
}





