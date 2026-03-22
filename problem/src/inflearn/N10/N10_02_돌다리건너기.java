package inflearn.N10;

import java.util.Scanner;

public class N10_02_돌다리건너기 {
	public int solution(int n) {
		int[] dy = new int[n+2];
		dy[1] = 1;
		dy[2] = 2;
		for(int i=3; i<=n+1; i++) {
			dy[i] = dy[i-2]+dy[i-1];
		}
		return dy[n+1];
	}

	public static void main(String[] args) {
		N10_02_돌다리건너기 T = new N10_02_돌다리건너기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
