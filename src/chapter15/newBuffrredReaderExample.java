package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class newBuffrredReaderExample {
	public static void main(String[] args) throws IOException {

		Path path = Path.of("src/chapter15/nagasaki.txt");
		BufferedReader in = Files.newBufferedReader(path);
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}
	}
}
