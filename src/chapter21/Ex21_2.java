//package chapter21;
//import static java.util.stream.Collectors.*;
//
//import java.util.List;
//import java.util.Map;
//
//public class Ex21_2 {
//
//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		List<Book> book = Book.getList();
//		
//		Map<String, List<String>> genre = list.stream()
//				.collect(groupingBy(Book::genre, mapping(Book::author, toList()) ));
//		
//		genre.forEach((k,v) -> System.out.println(k + " = " + v));
//	}
//
//}
