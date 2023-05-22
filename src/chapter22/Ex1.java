package chapter22;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class Ex1 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();

		LocalDate rosdate = LocalDate.of(2028, 7, 21);
		JapaneseDate jdate = JapaneseDate.from(rosdate);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("Gy年MM月dd日 eeee");
		System.out.println(jdate.format(fmt));

		LocalDate date1 = LocalDate.of(2022, 2, 1);
		Period period = Period.between(date, rosdate);
		System.out.println("オリンピックまであと"
				+ period.getYears() + "年 " + period.getMonths() + "月 " + period.getDays() + "日");
	}
}
