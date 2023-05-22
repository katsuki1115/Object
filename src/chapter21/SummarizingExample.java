package chapter21;

import static java.util.stream.Collectors.*;

import java.util.IntSummaryStatistics;
import java.util.List;

public class SummarizingExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Book> list = Book.getList();

		IntSummaryStatistics stat = list.stream()
				.collect(summarizingInt(Book::price));

		System.out.println(stat.getCount());
		System.out.println(stat.getSum());
		System.out.println(stat.getAverage());
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
	}

}
