package chapter21;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import chapter20.PC;

public class MaxMinExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<PC> list = PC.getList();

		Optional<PC> min = list.stream()
				.min(Comparator.comparing(PC::price));

		Optional<PC> max = list.stream()
				.min(Comparator.comparing(PC::price));

		System.out.println("最安値=" + min.get());
		System.out.println("最高値=" + max.get());

	}

}
