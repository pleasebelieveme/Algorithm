package inflearn.N2;

import java.util.Scanner;

/*
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2
*/

/**
 * 0 0 0 0 0 0 0
 * 0 5 3 7 2 3 0
 * 0 3 7 1 6 1 0
 * 0 7 2 5 3 4 0
 * 0 4 3 6 4 1 0
 * 0 8 7 3 5 2 0
 * 0 0 0 0 0 0 0
 */

public class N2_10_봉우리 {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		int[] tmp = new int[5];
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < n+1; j++) {
				// tmp [중앙, 위, 아래, 왼, 오]
				tmp[0] = arr[i][j]; // 1 1
				tmp[1] = arr[i-1][j]; // 0 1
				tmp[2] = arr[i+1][j]; // 2 1
				tmp[3] = arr[i][j-1]; // 1 0
				tmp[4] = arr[i][j+1]; // 1 2
				// for(int x : tmp) System.out.print(x + " ");
				// System.out.println();
				for (int k = 1; k < 5; k++) {
					if (tmp[k] > max) max = tmp[k];
				}
				// System.out.println("max = " + max);
				// System.out.println("tmp[0] = " + tmp[0]);
				if (tmp[0] > max) {
					answer++;
					// System.out.println("answer = " + answer);
					// System.out.println();
				}
				max = Integer.MIN_VALUE;
			}
		}
		return answer;
	}

	// 강의풀이
	public int solutionYou(int n, int[][] arr) {
		int answer = 0;
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n ; j++) {
				boolean flag = true;
				for (int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if(nx>=0 && nx<n && ny >= 0 && ny<n && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		return answer;
	}



	public static void main(String[] args) {
		N2_10_봉우리 T = new N2_10_봉우리();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+2][n+2];

		for (int i = 0; i < n+2; i++) {
			for (int j = 0; j < n+2; j++) {
				if(i==0) arr[0][j] = 0;
				else if (j==0) arr[i][0] = 0;
				else if (i+1==n+2) arr[i][j] = 0;
				else if (j+1==n+2) arr[i][j] = 0;
				else {
					arr[i][j] = kb.nextInt();
				}
			}
		}
		System.out.println(T.solution(n, arr));

		// 강의풀이
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		arr[i][j] = kb.nextInt();
		// 	}
		// }
		// System.out.println(T.solutionYou(n, arr));

		// 0으로 감싸서 출력하기
		// for(int[] x : arr){
		// 	for(int s : x) {
		// 		System.out.print(s + " ");
		// 	}
		// 	System.out.println();
		// }

	}
}
