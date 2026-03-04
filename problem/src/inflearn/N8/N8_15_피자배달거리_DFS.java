package inflearn.N8;

import java.util.ArrayList;
import java.util.Scanner;

public class N8_15_피자배달거리_DFS {

	static class Point {
		public int x, y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point> house, pizza;
	public void DFS(int level, int s) {
		if(level == m) {
			int sum = 0;
			for(Point h : house) {
				int distance = Integer.MAX_VALUE;
				for(int i : combi) {
					distance = Math.min(distance, Math.abs(h.x-pizza.get(i).x)+Math.abs(h.y-pizza.get(i).y));
				}
				sum += distance;
			}
			answer = Math.min(answer, sum);
		}
		else {
			for(int i=s; i<len; i++) {
				combi[level] = i;
				DFS(level+1, i+1);
			}
		}
	}
	public static void main(String[] args) {
		N8_15_피자배달거리_DFS T = new N8_15_피자배달거리_DFS();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // 도시지도정보
		m = kb.nextInt(); // 살려야하는 피자집의 개수
		house = new ArrayList<>();
		pizza = new ArrayList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int tmp = kb.nextInt();
				if(tmp == 1) house.add(new Point(i, j));
				else if(tmp == 2) pizza.add(new Point(i, j));
			}
		}
		len = pizza.size(); // 도시에 있는 피자집의 개수
		combi = new int[m]; // 살릴 피자집
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
