package chapter19;

import java.util.ArrayList;

import chapter16.Student;

public class Sample2 {
	public static void main(String[] args) {
		var list = new ArrayList<Student>() ;
		list.add(new Student(101, "katsuki"));
		list.add(new Student(102, "kido"));
		list.add(new Student(103, "nakasone"));
		
		list.forEach(System.out::println);
	}
}

// book::title
// String::charAt
// msg::equals
// Student::new
// ArrayList::new

// () -> new Student();
// str -> str!=null;
// student -> System.out.println(student.name());
// book -> book.price();

// str::equals(s)
// book::price
// 
