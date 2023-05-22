package chapter21;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CalculatingExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Book> list = Book.getList();
		long count = list.stream().collect(counting());

		int sum = list.stream()
				.collect(summingInt(Book::price));

		double ave = list.stream()
				.collect(averagingInt(Book::price));

		Optional<Book> max = list.stream()
				.collect(maxBy(Comparator.comparing(Book::price)));

		Optional<Book> min = list.stream()
				.collect(minBy(Comparator.comparing(Book::price)));

		System.out.println(count);
		System.out.println(sum);
		System.out.println(ave);
		System.out.println(max.get());
		System.out.println(min.get());
	}

}
