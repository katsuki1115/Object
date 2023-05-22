package chapter23;

import java.util.Arrays;
import java.util.List;

public class MatchesExample {

//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		List<String> list = Arrays.asList("Jack110", "suzu-10", "Ken3", "tom10");
//		for ( String s : list) {
//			if(s.matches("^(?=.*[A-Z])(?!.*\\W).{5,}$")) {
//				System.out.println(s);
//			}
//		}
//	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list = Arrays.asList("a00143", "Bbb1-23", "xxx999", "0aefes");
		for ( String s : list) {
			if(s.matches("^(?=[a-zA-Z]).{2,10}$")) {
				System.out.println(s);
			}
		}
		List<String> list2 = Arrays.asList("abc-12345", "xxx-34", "num-33", "0aefes");
		for ( String s : list2) {
			if(s.matches("^[a-z]{3}-\\d+$")) {
				System.out.println(s);
			}
		}
	}

}