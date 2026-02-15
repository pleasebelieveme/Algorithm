package inflearn.N7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N7_14_그래프_최단거리_BFS {

	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] check, distance;
	public void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		check[v] = 1;
		distance[v] = 0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int currentV = queue.poll();
			for(int nextV : graph.get(currentV)) {
				if(check[nextV]==0) {
					check[nextV] = 1;
					queue.offer(nextV);
					distance[nextV] = distance[currentV]+1;
				}
			}
		}
	}

	public static void main(String[] args) {
		N7_14_그래프_최단거리_BFS T = new N7_14_그래프_최단거리_BFS();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		check = new int[n+1];
		distance = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i + " : " + distance[i]);
		}
	}
}
