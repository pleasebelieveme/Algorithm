package inflearn.N6;

import java.util.Arrays;
import java.util.Scanner;

/*
8 32
23 87 65 12 57 32 99 81
 */
public class N6_08_이분검색 {
	// 이분검색은 정렬된 상황을 가정한다.
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0, rt = n-1;
		while (lt<=rt) {
			int mid = (lt+rt)/2;
			if(arr[mid]==m) {
				answer = mid+1;
				break;
			}
			if(arr[mid] > m) {
				rt = mid-1;
			}
			else {
				lt = mid+1;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		N6_08_이분검색 T = new N6_08_이분검색();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}
}
