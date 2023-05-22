package chapter11;

class Foo implements Version{

	@Override
	public String getVersion() {
		// TODO 自動生成されたメソッド・スタブ
		return "Foo version 1.0";
	}
	
}

class Bar implements Version{

	@Override
	public String getVersion() {
		// TODO 自動生成されたメソッド・スタブ
		return "Bar version 2.5";
	}
	
}

public class Polymorphism {
	public static void main(String[] args) {
		Version v;
		
		v = new Foo();
		System.out.println(v.getVersion());
		
		v = new Bar();
		System.out.println(v.getVersion());
	}
}
