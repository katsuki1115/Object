package chapter22;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate date = LocalDate.of(2027, 7, 13);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y年MM月dd日 eeee");
		
		System.out.println(date.format(fmt));
	}

}
