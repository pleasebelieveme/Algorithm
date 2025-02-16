package inflearn.N2;

import java.util.Scanner;

public class N2_07_점수계산 {
	public int solution(int n, int[] nArr) {
		// 내풀이
		int answer = 0;
		// int p = 1;
		// for (int i = 0; i < n; i++) {
		// 	if(nArr[i] == 1) {
		// 		answer += p;
		// 		p++;
		// 	} else {
		// 		p = 1;
		// 	}
		// }
		//

		// 강의풀이
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if(nArr[i]==1) {
				cnt++;
				answer += cnt;
			} else cnt=0;

		}
		return answer;
	}
	public static void main(String[] args) {
		N2_07_점수계산 T = new N2_07_점수계산();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] nArr = new int[n];
		for (int i = 0; i < n; i++) {
			nArr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, nArr));
	}
}
