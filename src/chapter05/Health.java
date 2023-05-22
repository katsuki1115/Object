package chapter05;

import jp.kwebs.lib.Input;

public class Health {
	public static void main(String[] args) {
		double weight = Input.getDouble();
		double height = Input.getDouble();
		
		double stdweight = Math.pow(height / 100, 2)*22;
		double bmi = weight / Math.pow(height/100, 2);
		
		System.out.println("標準体重" + stdweight);
		System.out.println("BMI指数" + bmi);
	}
}


// 体重、身長、