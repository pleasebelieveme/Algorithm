package 정보처리기사.Y24_1;

class firstArea {
	int x, y;
	public firstArea(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void print() {
		System.out.println(x + y);
	}
}

class secondArea extends firstArea {
	int bb = 3;
	public secondArea(int i) {
		super(i, i + 1);
	}
	public void print() {
		System.out.println(bb * bb);
	}
}

public class N18 {
	public static void main(String[] args) {
		firstArea st = new secondArea(10);
		st.print();
	}
}