package inflearn.N3;

import java.util.Scanner;

/*
8 6
1 2 1 3 1 1 1 2
 */
public class N3_04_연속부분수열 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int sum = 0;
		int p = 0;
		// 제한시간 1초 배열 10만개까지
		for (int i = 0; i < n; i++) {
			sum = arr[i];
			p = i+1;
			// System.out.println("sum = " + sum);
			if(sum==m) {
				answer++;
			} else if (sum > m) {
				continue;
			} else {
				while(sum < m && p < n) {
					sum += arr[p];
					// System.out.println("sum = " + sum);
					if(sum==m) {
						answer++;
						break;
					}
					p++;
				}
			}
		}
		return answer;
	}

	// 강의풀이
	public int solutionYou(int n, int m, int[] arr) {
		int answer = 0, sum=0, lt=0;
		// 증가하고
		for (int rt = 0; rt < n; rt++) {
			// 더하고
			sum += arr[rt];
			//확
			if(sum==m) answer++;
			while (sum >= m) {
				sum -= arr[lt++];
				if(sum==m) answer++;
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		N3_04_연속부분수열 T = new N3_04_연속부분수열();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solutionYou(n, m, arr));
	}
}
