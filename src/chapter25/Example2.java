package chapter25;

import java.util.concurrent.CompletableFuture;

public class Example2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CompletableFuture<Void> future = CompletableFuture
				.supplyAsync(() -> "Value")
				.thenAccept(result ->{
					System.out.println("★" + result);
				});
	}

}
