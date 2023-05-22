package chapter04;

public class Member {
	private final IdNumber id;
	private final String name;
	
	public Member(IdNumber id, String name) {
		this.id = new IdNumber(id.getNumber());
		this.name = name;
	}
	
	public IdNumber getId() {
		return new IdNumber(id.getNumber());
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
