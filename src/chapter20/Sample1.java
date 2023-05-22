package chapter20;

import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var fruits = List.of("banana", "peach", "apple", "strawberry");
		fruits.stream()
				.sorted()
				.forEach(System.out::println);
	}

}
