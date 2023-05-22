package chapter21;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Set;

import chapter20.PC;

public class ToSetExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<PC> list = PC.getList();
		Set<String> types = list.stream()
				.map(PC::type)
				.collect(toSet());

		types.forEach(System.out::println);
	}

}
