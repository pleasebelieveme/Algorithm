package inflearn.N8;

import java.util.Scanner;

public class N8_04_중복순열 {
	static int[] permutation; // 순열
	static int n, m;
	public void DFS(int level) {
		if(level == m) {
			for(int x : permutation) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for (int i = 0; i <= n; i++) {
				permutation[level] = i;
				DFS(level+1);
			}
		}
	}
	public static void main(String[] args) {
		N8_04_중복순열 T = new N8_04_중복순열();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // 1~n까지
		m = kb.nextInt(); // 조합 갯수
		permutation = new int[m];
		T.DFS(0);
	}
}
