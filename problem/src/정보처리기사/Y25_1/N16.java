package 정보처리기사.Y25_1;

public class N16 {
	public static void main(String[] args) {
		System.out.println(calc("5"));
	}

	static int calc(int value) {
		if (value <= 1) return value;
		return calc(value - 1) + calc(value - 2);
	}

	static int calc(String str) {
		int value = Integer.valueOf(str);
		if (value <= 1) return value;
		return calc(value - 1) + calc(value - 3);
	}
}