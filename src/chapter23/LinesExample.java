package chapter23;

import java.util.Arrays;

public class LinesExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String users = """
				2025,katsuki
				2026,kido
				2027,nakasone
				""";
		users.lines().forEach(System.out::println);
		System.out.println(users.replace(",", "-"));

		String data = "月,火,水,木,金";

		String[] dayOfWeek = data.split(",");
		Arrays.stream(dayOfWeek)
				.forEach(System.out::println);
		
		String asc = " Hello\n\t ";
		System.out.println("|" + asc.trim() + "|");
		System.out.println("|" + asc.strip() + "|");
		
		System.out.println();
		
		String uni = "　こんにちは ";
		System.out.println("|" + uni.trim() + "|");
		System.out.println("|" + uni.strip() + "|");
	}

}
