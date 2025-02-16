package inflearn.N3;

import java.util.Scanner;

public class N3_05_연속된자연수의합 {
	private int solution(int n) {
		int answer = 0;
		int sum=0, lt=0;
		int[] arr = new int[n];
		for (int i = 1; i <= n; i++) {
			arr[i-1] = i;
		}
		for (int rt = 0; rt < n; rt++) {
			// 더하고
			sum += arr[rt];
			//확
			if(sum==n) {
				answer++;
			}
			while (sum >= n) {
				sum -= arr[lt++];
				if(sum==n) {
					answer++;
				}
			}
		}
		return answer-1; // 마지막 숫자 빼기
	}

	// 강의풀이, n/2번만 하면돼!
	public int solutionYou(int n) {
		int answer = 0, sum = 0, lt = 0;
		int m = n/2+1;
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) arr[i] = i+1;
		for (int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if(sum==n) answer++;
			while (sum>=n) {
				sum -= arr[lt++];
				if(sum==n) answer++;
			}
		}
		return answer;
	}

	// 강의풀이 수학으로 풀기
	public int solutionMath(int n) {
		int answer = 0, cnt = 1;
		n--;
		while (n>0) {
			cnt++;
			n = n - cnt; // 1과 2를 뺌, n이 15면 12
			if(n%cnt == 0) answer++;
		}
		return answer;
	}
	public static void main(String[] args) {
		N3_05_연속된자연수의합 T = new N3_05_연속된자연수의합();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solutionMath(n));
	}
}
