package beakjoon.silver1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class N2178_미로2 {

    static int N, M, map[][];
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            char[] line = in.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                map[i][j] = line[j] - '0';
            }
        }
        System.out.println(bfs());
    }
    //       2,3
    // 3,2  (3,3)   3,4
    //       4,3
    //                  r-1, c r-1>=0
    //r, c-1 c-1>=0     r,c         r, c+1 c+1<M
    //                  r+1, c r+1<N

    //                           r+dr(-1), c+dc(0)
    // r+dc(0), c+dc(-1)         r, c          r+dc(0), c+dc(1)
    //                           r+dr(+1), c+dc(0)
    static int bfs() {
        int[] dr = {-1, 1, 0, 0}; // 상하좌우
        int[] dc = {0, 0, -1, 1};

        // 1) 방문순서를 관리할 큐랑 방문여부 관리할 배열 생성
        Queue<int[]> queue = new ArrayDeque<>(); // 링크드리스트보다 속도가 빠르다
        int[][] visited = new int[N][M]; // 0이 아닌 값: 출발지부터 현재칸까지 소요된 최소칸 수

        // 2) 탐색의 시작점 방문처리하고 큐에 넣기
        visited[0][0] = 1;
        queue.offer(new int[] {0, 0});

        // 3) 큐에 담겨있는 방문순서대로 모두 방문
        while (!queue.isEmpty()) {
            // 4) 큐에서 방문할 대상 꺼내고 해야할 일 처리
            int[] cur = queue.poll();
            // 도착지이면 끝내기
            if(cur[0] == N-1 && cur[1]==M-1) return visited[N-1][M-1];

            // 4방향에 대해 반복
            for (int d = 0; d < 4; d++) {
                int nr = cur[0] + dr[d]; // 다음 행
                int nc = cur[1] + dc[d]; // 다음 열
                // 경계체크, 장애물체크, 방문여부 체크
                if (nr < 0 || nr >= N || nc < 0 || nc >= M || map[nr][nc] == 0 || visited[nr][nc]>0) continue;

                // 큐에 방문예정 상태로 만들기(큐에 넣기)
                visited[nr][nc] = visited[cur[0]][cur[1]] + 1;
                queue.offer(new int[]{nr, nc});
            }
        }
        return -1;
    }
}
