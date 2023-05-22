package chapter19;

import chapter11.TaxRate;

public class Tax {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int shotoku = 200;
		double zeigaku = tax(shotoku, a -> a<100 ? 0.15 : 0.35);
		System.out.println("税額= " + zeigaku);
	}
	public static double tax(int shotoku, TaxRate obj) {
		double r = obj.rate(shotoku);
		return r * shotoku;
	}

}
