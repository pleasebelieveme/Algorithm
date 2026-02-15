package inflearn.N7;

import java.util.ArrayList;
import java.util.Scanner;

public class N7_13_경로탐색_인접리스트 {

	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] check;
	public void DFS(int v) {
		if(v==n) return;
		else {
			for(int nextV : graph.get(v)) {
				if(check[nextV]==0) {
					check[nextV] = 1;
					DFS(nextV);
					check[nextV] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		N7_13_경로탐색_인접리스트 T = new N7_13_경로탐색_인접리스트();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // 노드의 갯수
		m = kb.nextInt(); // 간선의 갯수
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		check = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		check[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
