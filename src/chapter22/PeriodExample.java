package chapter22;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate birthday = LocalDate.of(1999, 11, 15);
		LocalDate today = LocalDate.now();
		System.out.println(birthday + "～" + today);
		
		long days = ChronoUnit.DAYS.between(birthday, today);
		System.out.println("誕生日から" + days + "日");
		
		Period period = Period.between(birthday, today);
		System.out.print(period.getYears() + "才 ");
		System.out.print(period.getMonths() + "ヵ月 ");
		System.out.print(period.getDays() + "日");
	}

}
