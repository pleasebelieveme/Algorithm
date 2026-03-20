package inflearn.N10;

import java.util.Scanner;

// DFS로 풀면 시간초과
public class N10_06_최대점수구하기_냅색 {

	public static void main(String[] args) {
		N10_06_최대점수구하기_냅색 T = new N10_06_최대점수구하기_냅색();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] dy = new int[m+1];
		for(int i=0; i<n; i++) {
			int problemScore = kb.nextInt();
			int problemTime = kb.nextInt();
			for(int j=m; j>=problemTime; j--) {
				dy[j] = Math.max(dy[j], dy[j-problemTime]+problemScore);
			}
		}
		System.out.println(dy[m]);
	}
}
