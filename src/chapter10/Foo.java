package chapter10;

abstract class Foo {
	private int n;

	public Foo(int n) {
		this.n = n;
	}
	public abstract void talk();
	public abstract double bye();
}

class Bar extends Foo{
	public Bar(int n) {
		super(n);
	}
	public void talk() {
		System.out.println("hello");
	}
	@Override
	public double bye() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
}

abstract class Baz extends Foo{
	public Baz(int n) {
		super(n);
	}
	public void talk() {
		System.out.println("hello");
	}
}