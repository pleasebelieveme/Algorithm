package inflearn.N8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N8_11_미로의최단거리 {
	class Point {
		public int x, y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, distance;
	public void BFS(int x, int y) {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(x, y));
		board[x][y] = 1;
		while(!queue.isEmpty()) {
			Point tmp = queue.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0) {
					board[nx][ny] = 1;
					queue.offer(new Point(nx, ny));
					distance[nx][ny] = distance[tmp.x][tmp.y]+1;
				}
			}
		}
	}

	public static void main(String[] args) {
		N8_11_미로의최단거리 T = new N8_11_미로의최단거리();
		Scanner kb = new Scanner(System.in);
		board = new int[8][8];
		distance = new int[8][8];
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		T.BFS(1, 1);
		if(distance[7][7]==0) System.out.println(-1);
		else System.out.println(distance[7][7]);
	}
}
