package chapter21;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;

import chapter20.PC;

public class ToMapExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<PC> list = PC.getList();
		Map<String, Integer> pcMap = list.stream()
				.collect(toMap(PC::name, PC::price));

		pcMap.forEach((k, v) -> System.out.println(k + " = " + v));
		
		//不変
		Map<String, Integer> pcMap1 = list.stream()
				.collect(toUnmodifiableMap(PC::name, PC::price));

		pcMap1.forEach((k, v) -> System.out.println(k + " = " + v));
	}

}
