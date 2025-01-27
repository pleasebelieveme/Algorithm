package inflearn.N3;

import java.util.Scanner;

public class N3_06_최대길이연부분수열 {
	// 슬라이딩윈도우 사용
	public int solution(int n, int k, int[] arr) {
		int answer = 0, cnt = 0, lt = 0;
		for (int rt = 0; rt < n; rt++) {
			if(arr[rt]==0) cnt++;
			while (cnt>k) {
				if(arr[lt]==0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		return answer;
	}
	public static void main(String[] args) {
		N3_06_최대길이연부분수열 T = new N3_06_최대길이연부분수열();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, k, arr));
	}
}
