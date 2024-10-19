package beakjoon.silver2;

import java.util.Scanner;

public class N4963_섬의개수 {
    static int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1}, {1, 0}, {1, 1}
    };

    static void dfs(int x, int y, int h, int w, int[][] grid) {
        // 방문 체크 및 범위 확인
        if (x < 0 || x >= h || y < 0 || y >= w || grid[x][y] == 0) {
            return;
        }
        // 현재 위치 방문 처리
        grid[x][y] = 0;
        // 8방향 탐색
        for (int[] dir : directions) {
            dfs(x + dir[0], y + dir[1], h, w, grid);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            if (w == 0 && h == 0) {
                break;
            }

            int[][] grid = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    grid[i][j] = scanner.nextInt();
                }
            }

            int islandCount = 0;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (grid[i][j] == 1) { // 섬을 찾았을 때
                        dfs(i, j, h, w, grid); // 섬 탐색
                        islandCount++; // 섬 개수 증가
                    }
                }
            }
            System.out.println(islandCount);
        }

        scanner.close();
    }
}
