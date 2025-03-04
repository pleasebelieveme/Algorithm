package inflearn.N6;

import java.util.Scanner;

/*
6
13 5 11 7 23 15
 */
public class N6_02_버블정렬 {
	// 가장 큰수가 가장 뒤로 배치
	// 반복횟수가 1씩 줄어듬

	public int[] solution(int n, int[] arr) {
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1 ; j++) {
				if(arr[j] >arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		N6_02_버블정렬 T = new N6_02_버블정렬();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int i : T.solution(n, arr)) System.out.print(i + " ");
	}
}
