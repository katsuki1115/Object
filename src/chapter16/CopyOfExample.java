package chapter16;

import java.util.ArrayList;
import java.util.List;

public class CopyOfExample {
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("katsuki");
		list.add("kido");
		list.add("nakasone");
		print(list);
		
		var list2 = List.copyOf(list);
		
		list.remove(0);
		print(list);
		print(list2);
	}
	
	static void print(List<String> list) {
		for(String s : list) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
