package chapter12;

public class Ex2 {
	public static void main(String[] args) {
		try {
			color();
		}catch(BadColorException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void color() {
		throw new BadColorException("★不正な色です");
	}
}
