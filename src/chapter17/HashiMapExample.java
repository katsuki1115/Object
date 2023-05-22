package chapter17;

import java.util.HashMap;

public class HashiMapExample {
	public static void main(String[] args) {
		var map = new HashMap<Integer, String>();
		map.put(115, "katsuki");
		map.put(108, "kido");
		map.put(105, "nakasone");

		System.out.println(map.get(108));
	}
}
