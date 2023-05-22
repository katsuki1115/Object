package chapter21;

import java.util.List;
import java.util.Optional;

import chapter20.PC;

public class ReduceExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<PC> pcList = PC.getList();
		
		Optional<String> names = pcList.stream()
				.map(PC::name)
				.reduce((a,b) -> a + ", " + b);
		
		System.out.println(names.get());
	}

}
