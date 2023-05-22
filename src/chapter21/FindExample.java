package chapter21;

import java.util.List;
import java.util.Optional;

import chapter20.PC;

public class FindExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<PC> pcList = PC.getList();

		Optional<String> anyPc = pcList.stream()
				.filter(pc -> "Panann".equals(pc.maker()))
				.map(PC::maker)
				.findAny();

		System.out.println(anyPc.orElseGet(() -> "存在しない"));
	}

}
