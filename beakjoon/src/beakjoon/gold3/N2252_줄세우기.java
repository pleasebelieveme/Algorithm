package beakjoon.gold3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N2252_줄세우기 {

    static  int N, inDegree[];
    static ArrayList<Integer>[] adjList;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine()," ");
        N = Integer.parseInt(st.nextToken()); // 학생수
        int M = Integer.parseInt(st.nextToken()); // 키 비교횟수

        adjList = new ArrayList[N+1]; // 인접리스트 배열 생성
        inDegree = new int[N+1]; // 진입차수리스트 생성

        for (int i = 1; i <= N; i++) adjList[i] = new ArrayList<Integer>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            // from보다 to가 키가 커요 관계
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            adjList[from].add(to);
            inDegree[to]++;
        }
        //프로그램에서 가장 부하가 많이 걸리는 작업(오버헤드) : 입출력, 객체생성소멸
        ArrayList<Integer> list = topologySort();
        StringBuilder sb = new StringBuilder();
        for (int no : list) {
            sb.append(no).append(" ");
        }
        System.out.println(sb.toString().trim()); // 마지막 공백 제거 후 출력
    }
    static ArrayList<Integer> topologySort() {
        ArrayList<Integer> list = new ArrayList<>();
        // 1) 큐 생성
        Queue<Integer> queue = new ArrayDeque<Integer>();
        // 2) 진입차수가 0인 정점 큐에 넣기
        for (int i = 1; i <= N; i++) {
            if(inDegree[i]==0) queue.offer(i);
        }

        // 3) 큐가 비어있지 않을때까지 순서적으로 정렬
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            list.add(cur); // 줄세우기

            // 5) 현재 정점의 인접리스트 들여다 본다.
            for (Integer to : adjList[cur]) {
                if(--inDegree[to]==0) queue.offer(to);
            }
        }
        return list;
    }
}
