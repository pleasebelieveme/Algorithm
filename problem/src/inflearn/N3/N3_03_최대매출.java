package inflearn.N3;

import java.util.Scanner;

/*
10 3
12 15 11 20 25 10 20 19 13 15
 */
// Time Limit Exceeded
public class N3_03_최대매출 {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int[] sum = new int[n-k+1];
		for (int i = (k-1); i < n; i++) {
			for (int j = 1; j <= k; j++) {
				sum[i-k+1] += arr[i-k+j];
			}
		}
		int max = 0;
		for (int x : sum) {
			if(x > max) {
				max = x;
			}
			answer = max;
		}
		return answer;
	}

	// 강의풀이, 슬라이드윈도우 활용!
	public int solutionYou(int n, int k, int[] arr) {
		int answer = 0, sum = 0;
		for (int i = 0; i < k; i++) sum += arr[i];
		answer = sum;
		for (int i = k; i < n; i++) {
			sum += (arr[i] - arr[i-k]);
			answer = Math.max(answer, sum);
		}
		return answer;
	}
	public static void main(String[] args) {
		N3_03_최대매출 T = new N3_03_최대매출();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solutionYou(n, k, arr));
	}
}
