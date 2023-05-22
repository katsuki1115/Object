package chapter20;

import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var list = PC.getList();
		List<String> makers = list.stream().map(PC::maker).toList();
		
		makers.forEach(name -> System.out.print(name + " "));
	}

}
