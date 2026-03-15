package inflearn.N10;

import java.util.Scanner;

// 다이나믹 방법 사용(복잡도를 낮게 만들어 계산)
public class N10_01_계단오르기 {
	static int[] dy;
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for (int i = 3; i <= n; i++) {
			dy[i] = dy[i-1]+dy[i-2];
		}
		return dy[n];
	}

	public static void main(String[] args) {
		N10_01_계단오르기 T = new N10_01_계단오르기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int[n+1];
		System.out.println(T.solution(n));
	}
}
