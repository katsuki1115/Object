package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewBufferedReaderWithCharset {
	public static void main(String[] args) throws IOException {

		Path path = Path.of("src/chapter15/nagasaki_ms932.txt");
		BufferedReader in = Files.newBufferedReader(path,Charset.forName("MS932"));
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}
	}
}
