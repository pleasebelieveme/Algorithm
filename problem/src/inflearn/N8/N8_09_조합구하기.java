package inflearn.N8;

import java.util.Scanner;

public class N8_09_조합구하기 {
	static int maxNumber, selectCount;
	static int[] selected;
	public void DFS(int level, int start) {
		if(level==selectCount) {
			for(int x : selected) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for(int i=start; i<=maxNumber; i++) {
				selected[level] = i;
				DFS(level+1, i+1);
			}
		}
	}
	public static void main(String[] args) {
		N8_09_조합구하기 T = new N8_09_조합구하기();
		Scanner kb = new Scanner(System.in);
		maxNumber = kb.nextInt();  // 1 ~ maxNumber
		selectCount = kb.nextInt(); // 몇개를 조합할 것인지
		selected = new int[selectCount]; // 동적배열생성
		T.DFS(0, 1);
	}
}
