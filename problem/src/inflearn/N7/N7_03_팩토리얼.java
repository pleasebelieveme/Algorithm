package inflearn.N7;

public class N7_03_팩토리얼 {
	public int DFS(int n) {
		if(n==1) return 1;
		else return n*DFS(n-1);
	}

	public static void main(String[] args) {
		N7_03_팩토리얼 T = new N7_03_팩토리얼();
		System.out.println(T.DFS(5));
	}
}
