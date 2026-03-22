package inflearn.N10;

import java.util.Arrays;
import java.util.Scanner;

// 동전갯수가 50개가 되면 DFS로 1초안에 계산 불가
public class N10_05_동전교환_냅색 {
	static int n, m;
	static int[] dy;
	public int solution(int[] coin) {
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for(int i=0; i<n; i++) {
			for(int j=coin[i]; j<=m; j++) {
				dy[j] = Math.min(dy[j], dy[j-coin[i]]+1);
			}
		}
		return dy[m];
	}

	public static void main(String[] args) {
		N10_05_동전교환_냅색 T = new N10_05_동전교환_냅색();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // 동전갯수
		int[] arr = new int[n]; // 동전종류
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		m = kb.nextInt(); // 계산해야할 금액
		dy = new int[m+1];
		System.out.println(T.solution(arr));
	}
}
