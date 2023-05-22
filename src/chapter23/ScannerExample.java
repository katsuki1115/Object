package chapter23;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Path path = Path.of("data.txt");

		try (Scanner in = new Scanner(path);) {
			in.useDelimiter("[ \t]+|" + System.lineSeparator());
			while (in.hasNext()) {
				int number = in.nextInt();
				String name = in.next();
				double weight = in.nextDouble();
				System.out.println(number + "\t" + name + "\t" + weight);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
