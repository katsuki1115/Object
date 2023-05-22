package chapter21;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import chapter20.PC;

public class CalculateExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<PC> list = PC.getList();

		long count = list.stream().count();

		int sum = list.stream()
				.mapToInt(PC::price)
				.sum();

		OptionalDouble ave = list.stream()
				.mapToInt(PC::price)
				.average();

		OptionalInt max = list.stream()
				.mapToInt(PC::price)
				.max();

		OptionalInt min = list.stream()
				.mapToInt(PC::price)
				.min();

		System.out.println("件　数=" + count);
		System.out.println("合　計=" + sum);
		System.out.println("平　均=" + ave.getAsDouble());
		System.out.println("最大値=" + max.getAsInt());
		System.out.println("最小値=" + min.getAsInt());
	}

}
