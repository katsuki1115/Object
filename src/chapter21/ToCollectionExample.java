package chapter21;

import static java.util.stream.Collectors.*;

import java.util.TreeSet;

import chapter20.PC;

public class ToCollectionExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var list = PC.getList();

		TreeSet<String> set = list.stream()
				.map(PC::maker)
				.distinct()
				.peek(e -> System.out.printf("%10s", e))
				.collect(toCollection(TreeSet::new));

		System.out.println();
		set.forEach(e -> System.out.printf("%10s", e));
	}

}
