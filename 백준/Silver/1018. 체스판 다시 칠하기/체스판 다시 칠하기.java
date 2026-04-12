import java.util.*;
import java.io.*;

public class Main {
    // 가독성을 위한 상수 선언
    private static final boolean BLACK = true;
    private static final boolean WHITE = false;
    
    public static boolean[][] board;
    public static int minCount = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                // 상수를 사용하여 입력 단계부터 의미를 명확히 함
                board[i][j] = (str.charAt(j) == 'B') ? BLACK : WHITE;
            }
        }

        // 8x8로 자를 수 있는 모든 경우의 수 탐색
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                checkBoard(i, j);
            }
        }
        System.out.println(minCount);
    }

    public static void checkBoard(int x, int y) {
        int count = 0;
        
        // 기준: 맨 왼쪽 위가 WHITE(false)인 체스판이라고 가정
        boolean expectedColor = WHITE;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (board[i][j] != expectedColor) {
                    count++;
                }
                // 옆 칸은 색이 반전되어야 함
                expectedColor = !expectedColor;
            }
            // 줄이 바뀌면 시작 색상도 다시 반전 (8x8 구조 유지)
            expectedColor = !expectedColor;
        }

        /* * [핵심 로직]
         * count: WHITE로 시작하는 판 기준 틀린 개수
         * 64 - count: BLACK으로 시작하는 판 기준 틀린 개수
         */
        count = Math.min(count, 64 - count);
        
        // 전역 최솟값 갱신
        minCount = Math.min(minCount, count);
    }
}