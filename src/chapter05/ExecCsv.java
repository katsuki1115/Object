package chapter05;

public class ExecCsv {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "100,katsuki,20,68.0,178.5";
		
		Csv csv = new Csv(str);
		String name = csv.get(1);
		double weight = csv.getDouble(3);
		double height = csv.getDouble(4);
		
		double bmi = weight / Math.pow(height / 100, 2);
		System.out.printf("%5s%6.1f",name,bmi);
	}

}
