package chapter22;

import java.time.LocalDate;

public class CreateDate {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate date = LocalDate.of(2025, 12, 8);
		
		System.out.printf("%s%n%s" ,today, date);
	}
}
