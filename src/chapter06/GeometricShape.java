package chapter06;

public sealed class GeometricShape permits Circle{
	private String color;

	protected GeometricShape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
