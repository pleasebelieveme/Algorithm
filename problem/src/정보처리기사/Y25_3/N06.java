package 정보처리기사.Y25_3;

enum Tri {
	A("A"), B("AB"), C("ABC");

	private String code;

	Tri(String code) {
		this.code = code;
	}

	public String code() {
		return code;
	}
}

// 파일 이름인 N06과 매칭되도록 public class 이름을 수정했습니다.
public class N06 {
	public static void main(String[] args) {
		Tri t = Tri.values()[Tri.A.name().length()];
		System.out.print(t.code());
	}
}