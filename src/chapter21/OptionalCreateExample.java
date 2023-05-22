package chapter21;

import java.util.Optional;

record Books(String title, String author) {}

public class OptionalCreateExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Optional<Books> op1 = Optional.empty();
		Optional<Books> op2 = Optional.of(new Books("夏目漱石", "坊ちゃん"));
		Books book = null;
		Optional<Books> op3 = Optional.ofNullable(book);
		
		System.out.println(op1);

		System.out.println(op2);

		System.out.println(op3);
	}

}
