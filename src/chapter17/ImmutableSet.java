package chapter17;

import java.util.ArrayList;
import java.util.Set;

public class ImmutableSet {
	public static void main(String[] args) {
		var set = Set.of("katsuki", "kido", "nakasone");
		
		String[] names = {"katsuki", "kido", "nakasone"};
		var set2 = Set.of(names);
		
		var list = new ArrayList<String>();
		list.add("katsuki");
		list.add("irie");
		list.add("nakasone");
		
		var set3 = Set.copyOf(list);
	}
}
