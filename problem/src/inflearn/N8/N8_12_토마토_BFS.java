package inflearn.N8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N8_12_토마토_BFS {

	static class Point {
		public int x, y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, distance;
	static int n, m;
	static Queue<Point> queue = new LinkedList<>();
	public void BFS() {
		while(!queue.isEmpty()) {
			Point tmp = queue.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0) {
					board[nx][ny] = 1;
					queue.offer(new Point(nx, ny));
					distance[nx][ny] = distance[tmp.x][tmp.y]+1;
				}
			}
		}
	}
	public static void main(String[] args) {
		N8_12_토마토_BFS T = new N8_12_토마토_BFS();
		Scanner kb = new Scanner(System.in);
		m = kb.nextInt(); // 열
		n = kb.nextInt(); // 행
		board = new int[n][m];
		distance = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				board[i][j] = kb.nextInt();
				if(board[i][j]==1) queue.offer(new Point(i, j));
			}
		}
		T.BFS();
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(board[i][j]==0) flag = false;
			}
		}
		if(flag) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					answer = Math.max(answer, distance[i][j]);
				}
			}
			System.out.println(answer);
		}
		else System.out.println(-1);
	}
}
