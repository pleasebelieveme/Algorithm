import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            int[][] dp = new int[15][15];

            // 0층 초기화
            for (int i = 1; i <= 14; i++) {
                dp[0][i] = i;
            }

            // Dynamic Programming(동적 계획법) 채우기
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j == 1) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    }
                }
            }

            System.out.println(dp[k][n]);
        }
    }
}