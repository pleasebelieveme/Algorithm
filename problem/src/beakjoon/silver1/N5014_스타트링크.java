package beakjoon.silver1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class N5014_스타트링크 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // F, S, G, U, D
        int F = sc.nextInt();
        int S = sc.nextInt();
        int G = sc.nextInt();
        int U = sc.nextInt();
        int D = sc.nextInt();

        int visited[] = new int[F+1]; // 해당층에 방문한 적이 있는지... 있다면 그 떄의 최소버튼 조작수
        Arrays.fill(visited, -1); // 해당층에 방문하지 않은 상태로 초기화

        Queue<Integer> queue = new ArrayDeque<>();
        visited[S] = 0;
        queue.offer(S);

        int[] move = {U, -D};
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if(cur==G) break;

            for (int m : move) {
                int nextFloor = cur + m;
                if(nextFloor < 1 || nextFloor > F || visited[nextFloor] != -1) continue;
                visited[nextFloor] = visited[cur] + 1;
                queue.offer(nextFloor);
            }
        }
        System.out.println((visited[G] == -1 ? "use the stairs" : visited[G]));
    }
}
