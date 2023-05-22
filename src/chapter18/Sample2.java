package chapter18;

import java.util.ArrayList;
import java.util.Comparator;

public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var c_list = new ArrayList<Child>();
		c_list.add(new Child());
		c_list.add(new Child());
		
		c_list.sort(Comparator.comparing(Parent::key));
	}

}
