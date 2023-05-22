package chapter20;

import java.util.List;

public class FilterExample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var list = PC.getList();
		List<PC> maker_panan = list.stream()
				.filter(pc -> "Panan".equals(pc.maker()))
				.toList();
	}

}
