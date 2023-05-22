package chapter22;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex4 {
	public static void main(String[] args) {
		LocalDateTime dt1 = LocalDateTime.of(2025, 02, 21, 13, 00, 00);
		LocalDateTime dt2 = LocalDateTime.of(2026, 05, 07, 10, 15, 30);
		LocalDateTime dt3 = dt1.plusMinutes(3245).plusSeconds(320);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd ahh:mm:ss");
		System.out.println(dt3.format(fmt));

		Duration p = Duration.between(dt1, dt2);
		System.out.println(p.toSeconds() + "秒間");
	}
}
