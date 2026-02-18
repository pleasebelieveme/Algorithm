package inflearn.N8;

import java.util.Scanner;

public class N8_08_수열추측하기 {
	static int[] b, permutation, check;
	static int n, finalNumber;
	boolean flag = false;
	int[][] dy = new int[35][35];
	public int combine(int n, int r) {
		if(dy[n][r]>0) return dy[n][r];
		if(n==r || r==0) return 1;
		else return dy[n][r] = combine(n-1, r-1) + combine(n-1, r);
	}

	public void DFS(int level, int sum) {
		if(flag) return;
		if(level==n) {
			if(sum==finalNumber) {
				for(int x : permutation) System.out.print(x + " ");
				flag = true;
			}
		}
		else {
			for (int i = 1; i <=n ; i++) {
				if(check[i]==0) {
					check[i] = 1;
					permutation[level] = i;
					DFS(level+1, sum+(permutation[level]*b[level]));
					check[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		N8_08_수열추측하기 T = new N8_08_수열추측하기();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		finalNumber = kb.nextInt();
		b = new int[n];
		permutation = new int[n];
		check = new int[n+1];
		for (int i = 0; i < n; i++) {
			b[i] = T.combine(n-1, i);
		}
		T.DFS(0, 0);
	}
}

