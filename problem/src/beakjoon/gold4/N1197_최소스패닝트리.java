package beakjoon.gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class N1197_최소스패닝트리 {

    static class Edge implements Comparable<Edge> {
        int from, to, weight;
        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
        @Override
        public int compareTo(Edge o) {// 21억 - -1억 : 21억 + 1억 : 오버플로우
            // return this.weight - o.weight;
            return Integer.compare(this.weight, o.weight);// 오름차순
            // return Integer.compare(o.weight, this.weight);// 내림차순
        } // ==> 음수나 0을 반환 : 그대로 둠, 양수반환 : 교환
    }
    static int V, E;
    static int[] parents;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        Edge[] edges = new Edge[E];
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            edges[i] = new Edge(from, to, weight);
        } // 간선 리스트 만들기

        // 간선리스트 가중치 기준 오름차순 정렬
        Arrays.sort(edges);
        // 알고리즘은 람다방식이 더 느리다 어나니머스이너클래스가 더 빠름
        /*Arrays.sort(edges, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return Integer.compare(o1.weight, o2.weight);
            }
        });*/
        makeSets();
        int cost = 0, cnt = 0;
        for (Edge edge : edges) {
            if(union(edge.from, edge.to)) {
                cost += edge.weight;
                if(++cnt == V-1) break;
            }
        }
        System.out.println(cost);
    }
    static void makeSets() {
        parents = new int[V+1];
        for (int i = 1; i < V+1; i++) {
            parents[i] = i; // 자신의 부모를 자신으로 하는 즉, 자신이 잡합의 대표자가 되도록 단위서로서 집합 생성
        }
    }
    static int findSet(int x) {
        if(x==parents[x]) return x;
        return parents[x] = findSet(parents[x]); // pass compression(경로압출) : 집합의 대표자를 부모로 교체
    }
    static boolean union(int a, int b) {
        int aRoot = findSet(a);
        int bRoot = findSet(b);
        if(aRoot == bRoot) return false;
        parents[bRoot] = aRoot;
        return true;
    }
}
