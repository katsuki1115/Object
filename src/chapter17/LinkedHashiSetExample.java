package chapter17;

import java.util.LinkedHashSet;

public class LinkedHashiSetExample {
	public static void main(String[] args) {
		var ids = new LinkedHashSet<String>();
		ids.add("アンパンマン");
		ids.add("スーパーマン");
		ids.add("バットマン");
		ids.add("スパイダーマン");
		ids.add("バットマン");
		ids.add("アンパンマン");
		ids.add("ハリーポッター");

		for (String id : ids) {
			System.out.println(id);
		}
	}
}
