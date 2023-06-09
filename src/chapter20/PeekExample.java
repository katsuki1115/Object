package chapter20;

import java.util.List;

public class PeekExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var list = PC.getList();
		List<Integer> prices = list.stream()
				.map(PC::price)
				.peek(price -> System.out.printf("%6d", price))
				.distinct()
				.toList();
		
		System.out.println();
		prices.forEach(p -> System.out.printf("%6d", p));
	}

}
