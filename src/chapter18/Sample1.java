package chapter18;

import java.util.ArrayList;

class Parent {
		private double key = Math.random();
		public double key() {
			return key;
		}
}

class Child extends Parent {
}

public class Sample1 {
	public static void main(String[] args) {
		var c_list = new ArrayList<Child>();
		c_list.add(new Child());
		c_list.add(new Child());
	}
}
