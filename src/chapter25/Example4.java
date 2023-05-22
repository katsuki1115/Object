package chapter25;

import java.util.concurrent.CompletableFuture;

public class Example4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CompletableFuture<String> future = CompletableFuture
				.supplyAsync(() -> "Value")
				.thenCompose(result -> CompletableFuture.supplyAsync(() -> "★" + result))
				//非同期処理を連結する
				.whenComplete((ret,err) -> {
					if(err==null) {
						System.out.println(ret + "★");
					}else {
						System.out.println("エラーです");
					}
				});
	}

}
