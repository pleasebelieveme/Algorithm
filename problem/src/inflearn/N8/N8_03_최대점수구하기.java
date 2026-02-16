package inflearn.N8;

import java.util.Scanner;

public class N8_03_최대점수구하기 {
	static int answer = Integer.MIN_VALUE, n, m;
	public void DFS(int level, int sum, int time, int[] problemScore, int[] problemTime){
		if(time > m) return;
		if(level == n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(level+1, sum+problemScore[level], time+problemTime[level], problemScore, problemTime);
			DFS(level+1, sum, time, problemScore, problemTime);
		}
	}
	public static void main(String[] args) {
		N8_03_최대점수구하기 T = new N8_03_최대점수구하기();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
			b[i] = kb.nextInt();
		}
		T.DFS(0, 0, 0, a, b);
		System.out.println(answer);
	}
}
