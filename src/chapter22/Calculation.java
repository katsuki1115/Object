package chapter22;

import java.time.LocalDate;

public class Calculation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate today = LocalDate.now();
		LocalDate newDay = today.plusDays(150);
		System.out.println(today);
		System.out.println(newDay);
	}

}
