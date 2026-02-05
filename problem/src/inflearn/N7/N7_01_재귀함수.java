package inflearn.N7;

public class N7_01_재귀함수 {
	public void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		N7_01_재귀함수 T = new N7_01_재귀함수();
		T.DFS(3);
	}
}
