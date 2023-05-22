package chapter21;
import static java.util.stream.Collectors.*;

import java.util.List;

import chapter20.Department;
public class JoiningExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Department> list = Department.getList();
		
		String employees = list.stream()
				.map(Department::employees)
				.flatMap(List::stream)
				.collect(joining(", "));
		
		System.out.println(employees);
	}

}
