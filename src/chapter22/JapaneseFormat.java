package chapter22;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class JapaneseFormat {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2021, 7, 13);
		JapaneseDate jdate = JapaneseDate.from(date);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("Gy年MM月dd日 eeee");
		System.out.println(jdate.format(fmt));
	}
}