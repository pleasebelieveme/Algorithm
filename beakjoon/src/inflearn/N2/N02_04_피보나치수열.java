package inflearn.N2;

import java.util.Scanner;

public class N02_04_피보나치수열 {
	public int[] solution(int n) {
		//ArrayList<Integer> answer = new ArrayList<>();
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		// 1 1 2 3 5 8 13 21 34 55 89
		for (int i = 2; i < n; i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		return answer;
	}
	// 배열을 안쓴다면
	public void solution2(int n) {
		int a = 1, b = 1, c;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
	public static void main(String[] args) {
		N02_04_피보나치수열 T = new N02_04_피보나치수열();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		// for (int i : T.solution(n)) System.out.print(i + " ");
		// solution2
		T.solution2(n);
	}
}
