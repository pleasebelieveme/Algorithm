package 정보처리기사.Y24_1;

class Parent {
	int x, y;

	Parent(int x, int y) { // ❶
		this.x = x;
		this.y = y;
	}

	int getX() { // ❷
		return x * y;
	}
}

class Child extends Parent {
	int x;

	Child(int x) { // ❸
		super(x + 1, x);
		this.x = x;
	}

	int getX(int n) { // ❹
		return super.getX() + n;
	}
}

public class N11 {
	public static void main(String[] args) { // ❺
		Parent parent = new Child(10); // ❻
		System.out.println(parent.getX()); // ❼
	}
}