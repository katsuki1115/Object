package chapter20;

import java.util.List;

public class DropWhileExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var list = List.of(9,6,5,5,2,1,8,5,4,9);
		list.stream().dropWhile(n -> n > 5).forEach(n -> System.out.print(n + " "));
	}

}
