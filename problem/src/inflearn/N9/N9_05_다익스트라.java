package inflearn.N9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class N9_05_다익스트라 {
	// 가중치 방향 그래프
	static class Edge implements Comparable<Edge> {
		public int vertex; // 정점
		public int cost; // 가중치 값
		Edge(int vex, int cost) {
			this.vertex = vertex;
			this.cost = cost;
		}
		@Override
		public int compareTo(Edge ob) {
			return this.cost - ob.cost;
		}
	}

	static int n, m;
	static ArrayList<ArrayList<Edge>> graph;
	static int[] distance;
	public void solution(int v) {
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(v, 0));
		distance[v] = 0;
		while (!pQ.isEmpty()) {
			Edge tmp = pQ.poll();
			int now = tmp.vertex;
			int nowCost = tmp.cost;
			if(nowCost > distance[now]) continue;
			for(Edge ob : graph.get(now)) {
				if(distance[ob.vertex] > nowCost+ob.cost) {
					distance[ob.vertex] = nowCost+ob.cost;
					pQ.offer(new Edge(ob.vertex, nowCost+ob.cost));
				}
			}
		}
	}

	public static void main(String[] args) {
		N9_05_다익스트라 T = new N9_05_다익스트라();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // 정점의 갯수
		m = kb.nextInt(); // 간선의 갯수
		graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Edge>());
		}
		distance = new int[n+1];
		Arrays.fill(distance, Integer.MAX_VALUE);
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge(b, c));
		}
		T.solution(1);
		for(int i=2; i<=n; i++) {
			if(distance[i] != Integer.MAX_VALUE) System.out.println(i + " : " + distance[i]);
			else System.out.println(i + " : impossible");
		}
	}
}
