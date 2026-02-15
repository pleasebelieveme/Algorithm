package inflearn.N7;

import java.util.Scanner;

public class N7_12_경로탐색_DFS {

	static int n, m, answer = 0;
	static int[][] gragh;
	static int[] check;
	public void DFS(int v) {
		if(v==n) answer++;
		else {
			for(int i=1; i<n; i++) {
				if(gragh[v][i]==1 && check[i]==0) {
					check[i] = 1;
					DFS(i);
					check[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		N7_12_경로탐색_DFS T = new N7_12_경로탐색_DFS();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // 노드의 갯수
		m = kb.nextInt(); // 간선의 갯수
		gragh = new int[n+1][n+1];
		check = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			gragh[a][b] = 1;
		}
		check[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
