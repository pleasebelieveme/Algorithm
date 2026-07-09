package 정보처리기사.Y26_1;

public class N07 {

	// static을 붙여 독립적인 구조로 만들어 줍니다.
	static class A {
		String f(Object x) {
			return "1";
		}
		String g() {
			return f("a");
		}
	}

	static class B extends A {
		String f(Object x) {
			return "2";
		}
		String f(String x) {
			return "3";
		}
	}

	// 파일명을 따라 N07 클래스 내부에 main 메서드를 위치시킵니다.
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.g()); // 실행 시 정확하게 2가 출력됩니다.
	}
}