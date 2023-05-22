package chapter22;

import java.time.LocalDate;

public class CompareExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate date1 = LocalDate.of(2025, 1, 10);
		LocalDate date2 = LocalDate.of(2014, 12, 6);
		
		System.out.println(date1.isAfter(date2));
		System.out.println(date1.isBefore(date2));
		System.out.println(date1.isEqual(date2));
		System.out.println(date1.isLeapYear());
	}

}
