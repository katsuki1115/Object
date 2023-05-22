package chapter16;

import java.util.ArrayList;

public class Q16_3_1 {
	public static void main(String[] args) {
		var list = new ArrayList<>() ;
		list.add("おはよう");
		list.add("こんにちは");
		list.add("こんばんわ");
		
		list.add(2,"Hello");
		System.out.println(list.get(0));
		System.out.println(list.contains("Hello"));
		list.set(0, "bye");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
