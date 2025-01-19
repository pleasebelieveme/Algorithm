package inflearn.N2;

import java.util.Scanner;

/*
5
2 3 1 7 3
4 1 9 6 8
5 5 2 4 4
6 5 2 6 7
8 4 2 2 2
 */
public class N2_11_임시반장정하기 {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int[] num = new int[n]; // 학생 수
		int[] p = new int[n]; // 학생별 최종 점수
		int tmp = 0;
		int max = 0;
		// 세로로 1학년때부터 5학년때까지 돌기
		for (int i = 0; i < 5; i++) { // 1~5학년
			for (int j = 0; j < n; j++) {
				num[j] = arr[j][i];
				// System.out.print(num[j] + " ");
				for (int k = 0; k < n; k++) { // 같은 반 찾기
					if(j != k && num[j] == num[k]) {
						tmp++;
						break;
					}
				}
				// System.out.println("tmp = " + tmp);
			}
			p[i] = tmp;
			// 학생 별로 점수 비교하기
			for (int l = 0; l < n; l++) {
				if(p[i] > max) {
					max = p[l];
					answer = l + 1;
				}
			}
		}
		return answer;
	}

	// 강의풀이
	public int solutionYou(int n, int[][] arr) {
		int answer = 0, max = Integer.MIN_VALUE;
		for (int i = 1; i <= n ; i++) {
			int cnt = 0;
			for (int j = 1; j <= n; j++) {
				// if(i!=j)
				for (int k = 1; k <= 5; k++) {
					if(arr[i][k]==arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		N2_11_임시반장정하기 T = new N2_11_임시반장정하기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		// 내 풀이
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		// 강의풀이
		// int[][] arr = new int[n+1][6];
		// for (int i = 1; i <= n; i++) { // 학생번호
		// 	for (int j = 1; j < 6; j++) { // 1~5학년
		// 		arr[i][j] = kb.nextInt();
		// 	}
		// }

		System.out.println(T.solution(n, arr));
		// // 배열출력
		// for(int[] x : arr) {
		// 	for (int s : x) {
		// 		System.out.print(s + " ");
		// 	}
		// 	System.out.println();
		// }
	}
}
