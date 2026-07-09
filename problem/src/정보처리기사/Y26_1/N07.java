package 정보처리기사.Y26_1;

public class N07 {

	// static을 붙여 독립적인 구조로 생성
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
		String f(String x) { // 부모타입이면 자식에서만 정의한 메서드는 사용 불가
			return "3";
		}
	}

	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.g()); // 2
	}
}