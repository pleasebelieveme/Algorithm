package inflearn.N2;

import java.util.Scanner;

public class N2_09_격자판최대합 {
	/*
		10 13 10 12 15 - 60
		12 39 30 23 11 - 115
		11 25 50 53 15 - 154
		19 27 29 37 27 - 139
		19 13 30 13 19 - 94
		|  |  |  |  |
		71 117 149 138 87
		[0][0] ~ [4][4] - 155
		[0][4] ~ [4][0] - 134
	*/
	public int solution(int n, int[][]s) {
		int answer = Integer.MIN_VALUE;
		int[] ga = new int[n];
		int[] se = new int[n];
		int de1 = 0;
		int de2 = 0;
		int gaMax = 0;
		int seMax = 0;
		int[] tmp = new int[n];
		//가로
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += s[i][j];
			}
			ga[i] = sum;
		}
		for (int i = 0; i < n; i++) {
			if(ga[i] > gaMax) gaMax = ga[i];
		}
		// System.out.println("ga[] max = " +gaMax); // 154
		tmp[0] = gaMax;

		// 세로
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += s[j][i];
			}
			se[i] = sum;
		}
		for (int i = 0; i < n; i++) {
			if(se[i] > seMax) seMax = se[i];
		}
		// System.out.println("se[] max = " + seMax); // 149
		tmp[1] = seMax;


		// 대각선1
		for (int i = 0, j = 0; i < n; i++, j++) {
			int sum = 0;
			sum = s[i][j];
			de1 += sum;
		}
		// System.out.println(de1); // 155
		tmp[2] = de1;

		// 대각선2
		for (int i = 0, j = n-1; i < n; i++, j--) {
			int sum = 0;
			sum = s[i][j];
			de2 += sum;
		}
		// System.out.println(de2); // 134
		tmp[3] = de2;

		for (int i = 0; i < 4; i++) {
			if(tmp[i] > answer) answer = tmp[i];
		}
		return answer;
	}

	// 강의풀이
	public int solutionYou(int n, int[][] s) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2; // 행, 열
		for (int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += s[i][j];
				sum2 += s[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		sum1=sum2=0;
		for (int i = 0; i < n; i++) {
			sum1 += s[i][i];
			sum2 += s[i][n-1-i];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		return answer;
	}

	public static void main(String[] args) {
		N2_09_격자판최대합 T = new N2_09_격자판최대합();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] s = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) s[i][j] = kb.nextInt();
		}
		System.out.println(T.solutionYou(n, s));
	}
}
