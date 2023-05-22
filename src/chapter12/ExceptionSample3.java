package chapter12;

import jp.kwebs.lib.Input;

public class ExceptionSample3 {
	public static void main(String[] args) {
		int a = Input.getInt();
		int b = Input.getInt();
		try {
			int ans = div(a,b);
			System.out.println(a + "÷" + b + "=" + ans);
		}
		catch( ArithmeticException e) { //算術エラー
			System.out.println("0で割る計算はできません");
		}
	}
	
	public static int div(int a, int b) {
		return a/b;
	}
}
