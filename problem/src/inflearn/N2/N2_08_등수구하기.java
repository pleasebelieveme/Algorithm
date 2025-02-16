package inflearn.N2;

import java.util.Scanner;

public class N2_08_등수구하기 {
	public int[] solution(int n, int[] nArr) {
		int[] answer = new int[n];
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(nArr[j] > nArr[i]) {
					cnt++;
				}
			}
			answer[i] = cnt;
			cnt = 1;
		}
		return answer;
	}
	public static void main(String[] args) {
		N2_08_등수구하기 T = new N2_08_등수구하기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] nArr = new int[n];
		for (int i = 0; i < n; i++) {
			nArr[i] = kb.nextInt();
		}
		for (int x : T.solution(n, nArr))
			System.out.print(x + " ");

	}
}
