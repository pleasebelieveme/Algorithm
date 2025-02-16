package inflearn.N2;

import java.util.ArrayList;
import java.util.Scanner;

public class N2_06_뒤집은소수 {
	public boolean isPrime(int num) {
		if(num==1) return false;
		for (int i = 2; i < num ; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	public ArrayList<Integer> solution(int n, int[] nArr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = nArr[i];
			int res = 0;
			while (tmp>0) {
				int t = tmp % 10;
				res = res * 10 +t;
				tmp = tmp / 10;
			}
			if(isPrime(res)) answer.add(res);
		}
		return answer;
	}
	public static void main(String[] args) {
		N2_06_뒤집은소수 T = new N2_06_뒤집은소수();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] nArr = new int[n];
		for (int i = 0; i < n ; i++) {
			nArr[i] = kb.nextInt();
		}
		for (int x : T.solution(n, nArr))
			System.out.print(x + " ");
	}
}
