package chapter16;

import java.util.ArrayList;
import java.util.Comparator;

public class Sample2 {
	public static void main(String[] args) {
		var list = new ArrayList<Student>();
		list.add(new Student(103, "katsuki"));
		list.add(new Student(101, "kido"));
		list.add(new Student(102, "nakasone"));

		list.sort(Comparator.comparing(Student::id));
		list.sort(Comparator.comparing(Student::name));

		for (Student s : list) {
			System.out.println(s);
		}
	}
}
