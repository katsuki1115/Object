package chapter25;

import java.util.concurrent.TimeUnit;

public class ThreadExample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Thread t1 = new Thread(() ->{
			Task task = new Task("thread-1");
			task.doit();
		});
		t1.start();
		System.out.println("--- main finish ---");
	}

}

class Task{
	private String msg;
	public Task(String msg) {
		this.msg = msg;
	}
	public void doit() {
		System.out.println(msg);
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}
}
