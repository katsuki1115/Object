package exercise;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ex15_23 {
	public static void main(String[] args) {
		Path path = Path.of("src/exercise/data.txt");
		try (BufferedWriter out = Files.newBufferedWriter(path,
				StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);) {
			out.write(3002 + "\t");
			out.write("kido koryo" + "\t");
			out.write(70.2 + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
