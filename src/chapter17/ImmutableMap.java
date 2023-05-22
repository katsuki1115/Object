package chapter17;

import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var map1 = Map.of(1, "A", 2, "B", 3, "C");
		var map2 = Map.ofEntries(Map.entry(1, "aa"),
								  Map.entry(2, "bb"),
								  Map.entry(3, "cc"));
		
		var map = new HashMap<Integer, String>();
		map.put(100, "katsuki");
		map.put(110, "kido");
		
		var map3 = Map.copyOf(map);
	}

}
