package chapter24;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SmartPhone p = new SmartPhone("100", Color.WHITE);
		switch (p.color()) {
		case WHITE -> System.out.println("白色です");
		case BLACK -> System.out.println("黒色です");
		case GOLD -> System.out.println("金色です");

		}
	}

}
