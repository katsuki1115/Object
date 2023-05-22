package chapter21;

import static java.util.stream.Collectors.*;

import java.util.List;

import chapter20.PC;

public class ToListExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var list = PC.getList();

		//可変リスト
		List<String> mutable = list.stream()
				.map(PC::type)
				.collect(toList());

		//不変リスト
		List<String> immutable = list.stream()
				.map(PC::type)
				.collect(toUnmodifiableList());
	}

}
