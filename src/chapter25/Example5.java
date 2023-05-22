package chapter25;

import java.util.concurrent.CompletableFuture;

public class Example5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CompletableFuture<String> future = CompletableFuture
				.supplyAsync(() -> "☆★")
				.thenCombine(CompletableFuture.supplyAsync(() -> "★★"), (r1,r2) -> r1+r2)
				//非同期処理を結合する
				.whenComplete((ret,err) -> {
					if(err==null) {
						System.out.println("〇" + ret + "〇");
					}else {
						System.out.println("エラーです");
					}
				});
	}

}
