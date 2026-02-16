package inflearn.N8;

import java.util.Scanner;

public class N8_01_합이같은부분집합 {

	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;
	public void DFS(int level, int sum, int[] arr) {
		if(flag) return;
		if(sum > total/2) return;
		if(level == n) {
			if((total-sum) == sum) {
				answer = "YES";
				flag = true;
			}
		}
		else {
			DFS(level+1, sum+arr[level], arr);
			DFS(level+1, sum, arr);
		}
	}

	public static void main(String[] args) {
		N8_01_합이같은부분집합 T = new N8_01_합이같은부분집합();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
			total += arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
