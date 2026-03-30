import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] points = new int[N][2];

        for(int i = 0; i < N; i++) {
            points[i][0] = sc.nextInt(); // x
            points[i][1] = sc.nextInt(); // y
        }

        // 정렬 로직 설계
        Arrays.sort(points, (p1, p2) -> {
            if(p1[1] == p2[1]) { // y좌표가 같다면
                return p1[0] - p2[0]; // x좌표 오름차순
            }
            return p1[1] - p2[1]; // 아니면 y좌표 오름차순
        });

        // 출력 (StringBuilder를 쓰면 훨씬 빨라요!)
        StringBuilder sb = new StringBuilder();
        for(int[] p : points) {
            sb.append(p[0] + " " + p[1]).append("\n");
        }
        System.out.println(sb);
    }
}