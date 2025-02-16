package inflearn.N4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*
10 3
13 15 34 23 45 65 33 11 26 42
 */
public class N4_05_K번째큰수 {
	// treeset(중복제거, 정렬) 사용, 이진블랙트리(균형잡힌 이진트리)
	int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 내림차순
		// TreeSet<Integer> Tset = new TreeSet<>(); // 오름차순

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int l = j+1; l < n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		// 내림차순 출력
		int cnt = 0;
		for (int x : Tset) {
			cnt++;
			// System.out.println(x);
			if(cnt==k) answer = x;
		}
		// Tset.remove(143); // 값 제거
		// Tset.size(); // 갯수
		// Tset.first(); // 오름차순 가장 작은 값, 내림차순 가장 큰 값 반대 Tset.last();

		return answer;
	}
	public static void main(String[] args) {
		N4_05_K번째큰수 T = new N4_05_K번째큰수();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}
}
