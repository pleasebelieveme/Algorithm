package inflearn.N8;

import java.util.Scanner;

public class N8_08_수열추측하기 {
	static int[] binomial, sequence, visited;
	static int n, targetSum;
	boolean found = false;
	int[][] memo = new int[35][35];

	public int combination(int n, int r) {
		if(memo[n][r] > 0) return memo[n][r];
		if(n == r || r == 0) return 1;
		return memo[n][r] =
			combination(n-1, r-1) + combination(n-1, r);
	}

	public void DFS(int depth, int sum) {
		if(found) return;

		if(depth == n) {
			if(sum == targetSum) {
				for(int x : sequence)
					System.out.print(x + " ");
				found = true;
			}
		} else {
			for(int i = 1; i <= n; i++) {
				if(visited[i] == 0) {
					visited[i] = 1;
					sequence[depth] = i;
					DFS(depth+1,
						sum + sequence[depth] * binomial[depth]);
					visited[i] = 0;
				}
			}
		}
	}


	public static void main(String[] args) {
		N8_08_수열추측하기 T = new N8_08_수열추측하기();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		targetSum = kb.nextInt();
		binomial = new int[n];
		sequence = new int[n];
		visited = new int[n+1];
		for (int i = 0; i < n; i++) {
			binomial[i] = T.combination(n-1, i);
		}
		T.DFS(0, 0);
	}
}

