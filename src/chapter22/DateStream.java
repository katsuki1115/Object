package chapter22;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class DateStream {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate starDay = LocalDate.of(2025, 2, 1);
		LocalDate endDay = LocalDate.of(2025, 3, 1);
		
		List<LocalDate> dates = starDay.datesUntil(endDay).toList();
		
		starDay.datesUntil(endDay, Period.ofWeeks(1))
		.forEach(d -> System.out.printf("%12s", d));
	}

}
