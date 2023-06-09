package chapter24;

import java.util.List;

public class NormalUse {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var list = List.of(
				new SmartPhone("100", Color.WHITE),
				new SmartPhone("101", Color.BLACK),
				new SmartPhone("102", Color.BLACK),
				new SmartPhone("103", Color.GOLD));

		list.stream()
				.filter(s -> s.color() == Color.BLACK)
				.forEach(System.out::println);
	}

}
