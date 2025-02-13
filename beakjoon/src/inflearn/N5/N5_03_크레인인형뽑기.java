package inflearn.N5;

import java.util.Scanner;
import java.util.Stack;

/*
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4
 */
public class N5_03_크레인인형뽑기 {
	public int solution(int n, int[][] nArr, int m, int[] mArr) {
		int answer = 0;
		Stack<Integer> stk = new Stack<>();
		// 크레인 출력
		// for (int[] x : nArr){
		// 	for (int xx : x){
		// 		System.out.print(xx + " ");
		// 	}
		// 	System.out.println();
		// }

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// System.out.print(nArr[j][mArr[i]-1] + " ");
				if(nArr[j][mArr[i]-1]!=0) {
					if(stk.isEmpty() || stk.peek() != nArr[j][mArr[i]-1]) {
						stk.push(nArr[j][mArr[i]-1]);
						nArr[j][mArr[i]-1] = 0;
						break;
					} else {
						// System.out.println("peek" + stk.peek());
						stk.pop();
						answer += 2;
						nArr[j][mArr[i]-1] = 0;
						break;
					}
				}
				// System.out.println(stk.toString());
			}
			// System.out.println();
		}
		// 움직임 출력
		// for (int x : mArr)
		// 	System.out.print(x + " ");

		return answer;
	}

	// 강의풀이
	public int solutionYou(int[][] nArr, int[] mArr) {
		int answer = 0;
		Stack<Integer> stk = new Stack<>();
		for (int pos : mArr) {

			// nArr[0].length -> 열  길이
			for (int i = 0; i < nArr.length; i++) {
				if(nArr[i][pos-1] != 0) {
					int tmp = nArr[i][pos-1];
					nArr[i][pos-1]=0;
					if(!stk.isEmpty() && tmp == stk.peek()) {
						answer += 2;
						stk.pop();
					}
					else stk.push(tmp);
					break;
				}
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		N5_03_크레인인형뽑기 T = new N5_03_크레인인형뽑기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 배열
		int[][] nArr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				nArr[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt(); // 움직임 수
		int[] mArr = new int[m];
		for (int i = 0; i < m; i++) {
			mArr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, nArr, m, mArr));
		// System.out.println(T.solutionYou(nArr, mArr));
	}
}
