package chapter23;

import chapter05.Csv;

record User(int id, String name) {
}

public class TransformExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "2025, katsuki";

		User user = str.transform(s -> {
			var csv = new Csv(s);
			return new User(csv.getInt(0), csv.get(1));
		});
		System.out.println(user);
	}

}
