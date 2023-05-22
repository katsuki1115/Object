package exercise;

import java.io.IOException;
import java.io.PrintWriter;

public class Ex15_22 {
	public static void main(String[] args) {
		try (PrintWriter out = new PrintWriter("src/exercise/data.txt", "MS932");) {
			out.print(3001);
			out.print("\t");
			out.print("katsuki Rintaro");
			out.print("\t");
			out.print(70.2 + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
