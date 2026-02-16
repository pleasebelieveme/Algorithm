package inflearn.N8;

import java.util.Scanner;

public class N8_02_바둑이승차 {

	static int answer = Integer.MIN_VALUE, c, n;
	public void DFS(int level, int sum, int[] arr) {
		if(sum > c) return;
		if(level == n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(level+1, sum+arr[level], arr);
			DFS(level+1, sum, arr);
		}
	}
	public static void main(String[] args) {
		N8_02_바둑이승차 T = new N8_02_바둑이승차();
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt(); // 총 가능 무게
		n = kb.nextInt(); // 바둑이 마리수
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
