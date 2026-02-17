package inflearn.N8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class N8_05_동전교환 {

	static int n, m, answer = Integer.MAX_VALUE;
	public void DFS(int count, int sum, Integer[] arr) {
		if(sum > m) return;
		if(count >= answer) return;
		if(sum == m) {
			answer = Math.min(answer, count);
		}
		else {
			for(int i=0; i<n; i++) {
				DFS(count+1, sum+arr[i], arr);
			}
		}
	}

	public static void main(String[] args) {
		N8_05_동전교환 T = new N8_05_동전교환();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // 동전 갯수
		Integer[] arr = new Integer[n];
		for (int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		m = kb.nextInt(); // 요구 금액
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
