package chapter17;

import java.util.TreeSet;

import chapter16.Student;

public class StudentTreeSetExample {
	public static void main(String[] args) {
		var students = new TreeSet<Student>();

		students.add(new Student(130, "katsuki"));
		students.add(new Student(100, "kido"));
		students.add(new Student(120, "nakasone"));

		for (Student s : students) {
			System.out.println(s);
		}
	}
}
