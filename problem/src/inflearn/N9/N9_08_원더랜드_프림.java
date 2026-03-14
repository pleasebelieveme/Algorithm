package inflearn.N9;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class N9_08_원더랜드_프림 {

	static class Edge implements Comparable<Edge> {
		public int vertex;
		public int cost;
		Edge(int vertex, int cost) {
			this.vertex = vertex;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge ob) {
			return this.cost-ob.cost;
		}
	}

	public static void main(String[] args) {
		N9_08_원더랜드_프림 T = new N9_08_원더랜드_프림();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Edge>());
		}
		int[] ch = new int[n+1];
		for (int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge(b, c));
			graph.get(b).add(new Edge(a, c));
		}
		int answer = 0;
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(1, 0));
		while (!pQ.isEmpty()) {
			Edge tmp = pQ.poll();
			int endVertex = tmp.vertex;
			if(ch[endVertex] == 0) {
				ch[endVertex] = 1;
				answer += tmp.cost;
				for(Edge ob : graph.get(endVertex)) {
					if(ch[ob.vertex] == 0) pQ.offer(new Edge(ob.vertex, ob.cost));
				}
			}
		}
		System.out.println(answer);
	}
}
