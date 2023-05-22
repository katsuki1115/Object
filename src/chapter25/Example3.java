package chapter25;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Example3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CompletableFuture<String> future = CompletableFuture
				.supplyAsync(() -> "hello")
				.orTimeout(1, TimeUnit.SECONDS)
				.whenComplete((ret,err) -> {
					if(err==null) {
						System.out.println("★" + ret);
					}else {
						System.out.println("エラーです");
					}
				});
	}

}
