package chapter11;

public class Bookshop implements Readable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bookshop(String name) {
		this.name = name;
	}

	@Override
	public void read() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Readable");
	}
	
}
