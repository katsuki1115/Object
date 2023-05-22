package chapter21;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Ex21 {
	public static void main(String[] args) {
		List<Book> list = Book.getList();

		boolean result = list.stream()
				.anyMatch(b -> "木村花子".equals(b.author()));
		System.out.println(result);

		Optional<Book> anyBook = list.stream()
				.filter(b -> "木村花子".equals(b.author()))
				.findFirst();
		System.out.println(anyBook);

		String authors = list.stream()
				.map(Book::author)
				.reduce("", (a, b) -> a + " " + b);
		System.out.println(authors);

		OptionalDouble ave = list.stream()
				.mapToDouble(Book::price)
				.average();
		System.out.println(ave.getAsDouble());

		Optional<Book> book = list.stream()
				.max(Comparator.comparing(Book::price));
		System.out.println(book.get().getAuthor());
	}

}
