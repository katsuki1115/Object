package chapter16;

public record Student(int id, String name) implements Comparable<Student> {

	@Override
	public int compareTo(Student o) {
		// TODO 自動生成されたメソッド・スタブ
		return Integer.compare(this.id, o.id);
	}
	
}
