package inflearn.N6;

import java.util.Scanner;

public class N6_04_LRU {
	public int[] solution(int s, int n, int[] arr) {
		int[] cache = new int[s];
		for (int x : arr) {
			int pos = -1; // 인덱스 번호
			// 캐시 뒤지기
			for (int i = 0; i < s; i++) if(cache[i]==x) pos=i;
			if(pos==-1) {
				for (int i = s-1; i >= 1; i--) {
					cache[i] = cache[i-1];
				}
			}
			else {
				for (int i = pos; i >= 1; i--) {
					cache[i] = cache[i-1];
				}
			}
			cache[0] = x;
		}
		return cache;
	}
	public static void main(String[] args) {
		N6_04_LRU T = new N6_04_LRU();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for (int i : T.solution(s, n, arr)) System.out.print(i + " ");
	}
}
