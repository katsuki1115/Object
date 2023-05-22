package chapter22;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Ex2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate dseizin = LocalDate.of(2025, 1, 1);
		LocalDate dumi = LocalDate.of(2025, 7, 1);
		LocalDate dkeiro = LocalDate.of(2025, 9, 1);
		LocalDate dtaiiku = LocalDate.of(2025, 10, 1);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM月dd日 eeee");
		
		//成人の日
		TemporalAdjuster seizin = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY);
		System.out.println(dseizin.with(seizin).format(fmt));
		
		//海の日
		TemporalAdjuster umi = TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY);
		System.out.println(dumi.with(umi).format(fmt));
		
		//敬老の日
		TemporalAdjuster keiro = TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY);
		System.out.println(dkeiro.with(keiro).format(fmt));
		
		//体育の日
		TemporalAdjuster taiiku = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY);
		System.out.println(dtaiiku.with(taiiku).format(fmt));

	}

}
