package chapter15;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteExample {
	public static void main(String[] args) {
		try (PrintWriter out = new PrintWriter("data.txt", "MS932");) {
			out.print(100);
			out.print("\t");
			out.print("katsuki");
			out.print("\t");
			out.print(60.5);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
