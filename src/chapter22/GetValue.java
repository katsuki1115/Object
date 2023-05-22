package chapter22;

import java.time.LocalDate;

public class GetValue {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate date = LocalDate.of(2022, 7, 30);
		
		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		
	}

}
