package chapter25;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO 自動生成されたメソッド・スタブ
		CompletableFuture<String> future = CompletableFuture.supplyAsync( () -> "value");
		
		String msg = future.get();
		System.out.println(msg);
	}

}
