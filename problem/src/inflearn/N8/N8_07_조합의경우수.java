package inflearn.N8;

import java.util.Scanner;

public class N8_07_조합의경우수 {
	int[][] dy = new int[35][35]; // 메모이제이션
	public int DFS(int n, int r) {
		if(dy[n][r]>0) return dy[n][r];
		if(n==r || r==0) return 1;
		else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
	}
	public static void main(String[] args) {
		N8_07_조합의경우수 T = new N8_07_조합의경우수();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 총 갯수
		int r = kb.nextInt(); // 조합 갯수
		System.out.println(T.DFS(n, r));
	}
}
