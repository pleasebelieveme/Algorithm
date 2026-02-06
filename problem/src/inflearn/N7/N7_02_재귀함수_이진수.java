package inflearn.N7;

public class N7_02_재귀함수_이진수 {
	public void DFS(int n) {
		if(n==0) return;
		else {
			System.out.print(n%2 + " ");
			DFS(n/2);
		}
	}

	public static void main(String[] args) {
		N7_02_재귀함수_이진수 T = new N7_02_재귀함수_이진수();
		T.DFS(11);
	}
}
