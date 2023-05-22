package chapter16;

import java.util.ArrayList;

public class StrudentList {
	public static void main(String[] args) {
		var list = new ArrayList<Student>();
		list.add(new Student(101, "katsuki"));
		list.add(new Student(102, "katsuki"));
		list.add(new Student(103, "katsuki"));
		for (Student s : list) {
			System.out.println(s);
		}
	}
}
