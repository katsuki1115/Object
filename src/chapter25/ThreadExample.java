package chapter25;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Thread t1 = new Thread(() -> System.out.println("thread-1"));
		Thread t2 = new Thread(() -> System.out.println("thread-2"));
		Thread t3 = new Thread(() -> System.out.println("thread-3"));
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("--- main 終了　---");
	}

}
