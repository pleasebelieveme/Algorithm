package inflearn.N6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
	public int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		if(this.x==o.x) return this.y-o.y;
		else return this.x-o.x;
	}

	// // 내림차순
	// @Override
	// public int compareTo(Point o) {
	// 	if(this.x==o.x) return o.y-this.y;
	// 	else return o.x-this.x;
	// }
}
public class N6_07_좌표정렬 {
	// 실패, 모르겠다.
	public int[][] solution(int n, int[][] arr) {
		int[][] answer = {};
		Arrays.sort(arr[0]);
		return arr;
	}

	// 강의풀이
	// 클래스 생성

	public static void main(String[] args) {
		N6_07_좌표정렬 T = new N6_07_좌표정렬();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		// int[][] arr = new int[n][2];
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < 2; j++) {
		// 		arr[i][j] = kb.nextInt();
		// 	}
		// }
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < 2; j++) {
		// 		int[][] answer = T.solution(n, arr);
		// 		System.out.print(answer[i][j]);
		// 	}
		// }

		ArrayList<Point> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		for (Point o : arr) System.out.println(o.x + " " + o.y);
	}
}




