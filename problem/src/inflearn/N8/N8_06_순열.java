package inflearn.N8;

import java.util.Scanner;

public class N8_06_순열 {
	static int[] permutation, check, arr;
	static int n, m;
	public void DFS(int level) {
		if(level == m) {
			for (int x : permutation) {
				System.out.println(x + " ");
				System.out.println();
			}
		}
		else {
			for (int i = 0; i < n; i++) {
				if(check[i] == 0) {
					check[i] = 1;
					permutation[level] = arr[i];
					DFS(level+1);
					check[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		N8_06_순열 T = new N8_06_순열();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		check = new int[n];
		permutation = new int[m];
		T.DFS(0);
	}
}
