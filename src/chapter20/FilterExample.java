package chapter20;

public class FilterExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var list = PC.getList();
		
		list.stream()
			.filter(pc -> "Panan".equals(pc.maker()))
			.forEach(System.out::println);
	}

}
