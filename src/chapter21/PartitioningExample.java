package chapter21;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;

import chapter20.PC;

public class PartitioningExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<PC> list = PC.getList();
		Map<Boolean, List<String>> typeGroup = list.stream()
				.collect(partitioningBy(pc -> pc.price() > 60000, mapping(PC::name, toList())));
		typeGroup.forEach((k, v) -> System.out.println(k + " = " + v));
	}

}
