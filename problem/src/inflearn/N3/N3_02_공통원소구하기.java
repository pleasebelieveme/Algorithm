package inflearn.N3;

import static java.util.Collections.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
5
1 3 9 5 2
5
3 2 5 7 8
 */
public class N3_02_공통원소구하기 {
	// Time Limit Exceeded
	public ArrayList<Integer> solution(int n, int[] nArr, int m, int[] mArr) {
		ArrayList<Integer> answer = new ArrayList<>();
		// long start = System.currentTimeMillis();
		// System.out.println("start = " + start);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(nArr[i] == mArr[j]) answer.add(nArr[i]);
				// System.out.println("nArr = " + nArr[i]);
				// System.out.println("mArr = " + mArr[j]);
				continue;
			}
		}
		sort(answer);
		// long end = System.currentTimeMillis();
		// System.out.println("end = " + Math.abs((start - end)));
		return answer;
	}

	// 강의풀이
	public ArrayList<Integer> solutionYou(int n, int[] nArr, int m, int[] mArr) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(nArr);
		Arrays.sort(mArr);
		int p1=0, p2=0;
		while (p1<n && p2<m) {
			if(nArr[p1] == mArr[p2]) {
				answer.add(nArr[p1++]);
				p2++;
			} else if (nArr[p1]<mArr[p2]) p1++;
			else p2++;
		}
		return answer;
	}

	public static void main(String[] args) {
		N3_02_공통원소구하기 T = new N3_02_공통원소구하기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] nArr = new int[n];
		for (int i = 0; i < n; i++) {
			nArr[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] mArr = new int[m];
		for (int i = 0; i < m; i++) {
			mArr[i] = kb.nextInt();
		}
		for (int x : T.solutionYou(n, nArr, m, mArr)) System.out.print(x + " ");
	}
}
