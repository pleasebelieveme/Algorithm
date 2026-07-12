package 정보처리기사.Y26_1; // 인텔리제이 현재 패키지 경로에 맞게 자동 완성 기능을 쓰거나 src 밑에 두세요!

class Calc {
	int cc(int a, int b) {
		return a + b;
	}
	int cc(char a, char b) {
		return a - b;
	}
	int cc(char c) {
		return c;
	}
}

public class N17 {
	public static void main(String[] args) {
		Calc calc = new Calc();

		int r1 = calc.cc(5, 4);
		int r2 = calc.cc('c', 'a');
		char r3 = (char) calc.cc('3');

		System.out.println(r1 + r2 + "2" + r3);
	}
}