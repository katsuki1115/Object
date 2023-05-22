package chapter21;

import java.util.List;

import chapter20.PC;

public class MatchExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<PC> pcList = PC.getList();

		if (pcList.stream().anyMatch(pc -> "ARIBAN".equals(pc.name()))) {
			System.out.println("ARIBANと言う名前のパソコンはあります");
		} else {
			System.out.println("ARIBANと言う名前のパソコンはありません");
		}
		
		if (pcList.stream().noneMatch(pc -> "ARIBAN".equals(pc.name()))) {
			System.out.println("ARIBANと言う名前のパソコンはあります");
		} else {
			System.out.println("ARIBANと言う名前のパソコンはありません");
		}
		
		if (pcList.stream().allMatch(pc -> "ARIBAN".equals(pc.name()))) {
			System.out.println("ARIBANと言う名前のパソコンはあります");
		} else {
			System.out.println("ARIBANと言う名前のパソコンはありません");
		}
	}

}
