package chapter06;

public class Member {
	private final int id;
	private final String name;
	
	
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
}
