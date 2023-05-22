package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author no1s
 *
 */
public class Pass1 {
	public static void main(String[] args) {
		Path p = Path.of("src/chapter14");
		System.out.println(p.getParent());
		System.out.println(p.toAbsolutePath());
		Path p0 = Path.of("src/chapter14/text/memo.txt");
		Path p1 = Path.of("src/chapter14/text/note.txt");
		Path p3 = Path.of("src/chapter14/books/pdf/ref.pdf");
		Path p4 = Path.of("src/chapter14/hello.html");
		try {
			Files.createFile(p4);
			Path pass = Path.of("src/chapter14/html");
			Files.createDirectory(pass);
			Path target = Path.of("src/chapter14/html/hello.html");
			Files.move(p4, target);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
