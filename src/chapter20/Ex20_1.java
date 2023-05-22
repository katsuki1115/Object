package chapter20;

import java.util.List;

public class Ex20_1 {
	public static void main(String[] args) {
		List<Book> list = Book.getList();
		//		list.stream()
		//				.filter(book -> !book.stock())
		//				.forEach(System.out::println);

		list.stream()
				.filter(b -> "NOVEL".equals(b.author()))
				.map(Book::title)
				.forEach(System.out::println);
	}
}
