package inflearn.N3;

import static java.util.Collections.*;

import java.util.ArrayList;
import java.util.Scanner;

/*
3
1 3 5
5
2 3 6 7 9
 */
public class N3_01_두배열합치기 {
	public ArrayList<Integer> solution(int n, int[] nArr, int m, int[] mArr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			answer.add(nArr[i]);
		}
		for (int i = 0; i < m; i++) {
			answer.add(mArr[i]);
		}
		sort(answer);
		return answer;
	}

	// 강의풀이, 투포인트알고리즘?
	public ArrayList<Integer> solutionYou(int n, int[] nArr, int m, int[] mArr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;
		while (p1<n && p2<m){
			if(nArr[p1]<mArr[p2]) answer.add(nArr[p1++]); // 후위증감연산자
			else answer.add(mArr[p2++]);
		}
		while (p1<n) answer.add(nArr[p1++]);
		while (p2<m) answer.add(nArr[p2++]);
		return answer;
	}
	public static void main(String[] args) {
		N3_01_두배열합치기 T = new N3_01_두배열합치기();
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
		// for (int x : nArr) System.out.println("nArr[] = " + x + " ");
		// for (int x : mArr) System.out.println("mArr[] = " + x + " ");

		for (int x : T.solution(n, nArr, m, mArr)) System.out.print(x + " ");
	}
}
