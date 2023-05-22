package chapter17;

import java.util.HashMap;

public class MapOperation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var map = new HashMap<Integer, String>();
		map.put(115, "katsuki");
		map.put(108, "kido");
		map.put(105, "nakasone");
		map.put(115, "izumiya");

		System.out.println(map.get(115));
		System.out.println(map.get(200));
		System.out.println(map.getOrDefault(200, "***"));
	}

}
