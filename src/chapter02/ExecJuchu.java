package chapter02;
import java.time.LocalDate;

import exercise.Order;
public class ExecJuchu {
	public static void main(String[] args) {
		Order o1 = new Order("ICBK61", LocalDate.of(2025, 7, 11), 2100, 5, true);
		System.out.println("変更前");
		System.out.println(o1.getCode());
		System.out.println(o1.getDate());
		System.out.println(o1.getQuantity());
		o1.setCode("ICB61");
		o1.setDate(LocalDate.of(2025,8,30));
		o1.setQuantity(12);
		System.out.println("変更後");
		System.out.println(o1.getCode());
		System.out.println(o1.getDate());
		System.out.println(o1.getQuantity());
	}
}
