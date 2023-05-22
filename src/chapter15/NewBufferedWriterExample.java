package chapter15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NewBufferedWriterExample {
	public static void main(String[] args) {
		Path path = Path.of("data.txt");
		try (BufferedWriter out = Files.newBufferedWriter(path,
				StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);) {
			out.write(110 + "\t");
			out.write("katsuki" + "\t");
			out.write(732 + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//StandardOpenOption.DELETE_ON_CLOSE  ファイルを消すと消える