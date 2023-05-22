package chapter06;

public class ExecCircle {
	public static void main(String[] args) {
		Circle circle = new Circle("blue", 5.5);
		double area = Math.pow(circle.getRadius(),2) * Math.PI;
		
		System.out.println("色=" + circle.getColor());
		System.out.printf("半径=%1.1f\n",circle.getRadius());
		System.out.printf("面積=%2.2f", area);
	}
}
