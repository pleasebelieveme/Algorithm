package inflearn.N6;

import java.util.Scanner;

public class N6_03_삽입정렬 {
	public int[] solution(int n, int[] arr) {
		for (int i = 1; i < n; i++) {
			int tmp = arr[i], j;
			for (j = i-1; j>=0 ; j--) {
				if(arr[j] > tmp) {
					arr[j+1] = arr[j];
				}
				else break;
			}
			arr[j+1] = tmp;
		}
		return arr;
	}
	public static void main(String[] args) {
		N6_03_삽입정렬 T = new N6_03_삽입정렬();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int i : T.solution(n, arr)) System.out.print(i + " ");
	}
}
