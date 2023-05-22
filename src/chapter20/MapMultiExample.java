package chapter20;

public class MapMultiExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var list = Department.getList();
		
		list.stream().<String>mapMulti( (dep, buffer) ->{
			for(String name : dep.employees()) {
				buffer.accept(name);
			}
		})
		.forEach(n -> System.out.println(n + " "));
	}

}
