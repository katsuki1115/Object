package chapter17;

import java.util.HashMap;
import java.util.Map;

public class Map_EntryExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var map = new HashMap<Integer, String>();
		map.put(115, "katsuki");
		map.put(108, "kido");
		map.put(105, "nakasone");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
