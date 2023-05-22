package exercise;

import jp.kwebs.lib.Input;

public class Pass3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String pw = Input.getString("パスワード");
		boolean match = pw.matches("^(?=.*\\d+)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).{4,10}$");

		if (!match) {
			System.out.println("パスワードの要件をみたしていない");
		} else {
			System.out.println("OK");
		}
	}

}
