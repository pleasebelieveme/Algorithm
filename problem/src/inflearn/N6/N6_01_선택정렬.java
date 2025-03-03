package inflearn.N6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N6_01_선택정렬 {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		List<Integer> list = new ArrayList<>();
		for (int i : arr) list.add(i);
		list.sort(null);
		for (int i = 0; i < n; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	// 강의풀이 선택정렬로 풀기
	public int[] solutionYou(int n, int[] arr) {
		for (int i = 0; i < n-1; i++) {
			int idx = i;
			for (int j = i+1; j < n; j++) {
				if(arr[j] < arr[idx]) idx = j;
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		return arr;
	}
	public static void main(String[] args) {
		N6_01_선택정렬 T = new N6_01_선택정렬();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int i : T.solution(n, arr)) System.out.print(i + " ");

	}
}
