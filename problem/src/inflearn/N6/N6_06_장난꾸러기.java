package inflearn.N6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N6_06_장난꾸러기 {
	public int[] solution(int n, int[] h) {
		int[] answer = new int[2];
		int[] tmp = Arrays.copyOf(h, h.length);
		int idx = 0;
		Arrays.sort(tmp);
		for (int i = 0; i < n; i++) {
			if(h[i]!=tmp[i]) answer[idx++] = i+1;
		}
		return answer;
	}
	// 강의풀이
	public ArrayList<Integer> solutionYou(int n, int[] h) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = h.clone();
		Arrays.sort(tmp);
		for (int i = 0; i < n; i++) {
			if(h[i]!=tmp[i]) answer.add(i+1);
		}
		return answer;
	}
	public static void main(String[] args) {
		N6_06_장난꾸러기 T = new N6_06_장난꾸러기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) h[i] = kb.nextInt();
		for (int i : T.solutionYou(n, h)) System.out.print(i + " ");
	}
}
