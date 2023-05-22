package chapter23;

import java.util.Arrays;

public class ReplaceAllExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "<title>サンプル</title>";
		
		System.out.println(str.replaceAll("<.+?>", ""));
		
		String dt = "100, katsuki, 60.5";
		String[] dts = dt.split("\\s*,\\s*");
		Arrays.stream(dts).forEach(System.out::println);
	}
}
