package chapter17;

import java.util.HashSet;

public class HashiSetExample {
	public static void main(String[] args) {
		var ids = new HashSet<String>();
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
