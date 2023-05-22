package chapter20;

import java.util.List;

public class FlatmapExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var dlist = Department.getList();
		
		List<String> employees = dlist.stream().map(Department::employees).flatMap(List::stream).toList();
		
		employees.forEach(e -> System.out.print(e + " "));
	}

}
