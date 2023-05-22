package chapter06;

public class Ex {
	public static void main(String[] args) {
		Manager manager = new Manager((long) 110, "katsuki", 32, "プロジェクトマネージャー");
		
		System.out.println(manager.getId() + "\t" + manager.getName() + "\t" +manager.getAge() + "\t" + manager.getTitle());
	}
}
