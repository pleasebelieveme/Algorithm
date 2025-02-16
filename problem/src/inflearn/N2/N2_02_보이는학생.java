package inflearn.N2;

import java.util.Scanner;

public class N2_02_보이는학생 {
	// 내 풀이
	public int solution(int[] arr) {
		int answer = 0; // 1로 주고
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) { // int i = 1로 하면 계산을 한번 줄여줄 수 있음
			if(arr[i] > max) {
				answer++;
				max = arr[i];
			};
		}

		// 강의풀이(이중포문은 1초안에 풀이가 불가능)


		return answer;
	}
	public static void main(String[] args) {
		N2_02_보이는학생 T = new N2_02_보이는학생();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(arr)); // T.solution(n, arr)로 안넘겨줘도 됨
	}
}
