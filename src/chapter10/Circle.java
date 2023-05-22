package chapter10;

public class Circle extends GeometricShape{

	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public double area() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
