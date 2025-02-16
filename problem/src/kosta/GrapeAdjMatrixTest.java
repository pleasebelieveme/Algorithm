package kosta;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

//그래프 인접행렬 (무향그래프:양방향그래프)
// 정점수 간선수
// 간선정보 : from to
public class GrapeAdjMatrixTest {
    static int V;
    static int[][] adjMatrix;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt(); // 정점
        int E = sc.nextInt(); // 간선
        adjMatrix = new int[V][V];

        for (int i = 0; i < E; i++) { // 간선 정보 입력 처리
            int from = sc.nextInt();
            int to = sc.nextInt();
            adjMatrix[to][from] = adjMatrix[from][to] = 1;
        }
        //bfs();
        /* 입력
        5 7
        0 1
        0 2
        1 2
        1 3
        2 3
        2 4
        3 4
        A B C D E 출력
         */

        dfs(0, new boolean[V]);
    }

    static void bfs() {
        Queue<Integer> queue = new ArrayDeque<>(); // 큐를 통해 방문할 정점의 순서를 관리 : 탐색할 정점의 index
        boolean[] visited = new boolean[V]; // 기본값 false -> 방문하지 않은 상태!

        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print((char) (cur + 65) + " "); // 아스키코드 A=65

            // 자신의 인접 정점 중 미방문 정점들 큐에 넣기
            for (int i = 0; i < V; i++) {
                if (adjMatrix[cur][i] == 0 || visited[i]) continue; // 인접하지 않은 정점이거나 이미 방문했으면 패스
                queue.offer(i);
                visited[i] = true;
            }
        }
    }


    static void dfs(int cur, boolean[] visited) {
        visited[cur] = true;
        System.out.print((char) (cur + 65) + " "); // 아스키코드 A=65

        // 자신의 인접 정점 중 미방문 정점들 큐에 넣기
        for (int i = 0; i < V; i++) {
            if (adjMatrix[cur][i] == 0 || visited[i]) continue; // 인접하지 않은 정점이거나 이미 방문했으면 패스
            visited[i] = true;
            dfs(i, visited);
        }
    }
}