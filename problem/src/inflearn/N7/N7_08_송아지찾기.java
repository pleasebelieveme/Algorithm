package inflearn.N7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N7_08_송아지찾기 {
	int answer = 0;
	int[] distance = {1, -1, 5};
	int[] ch;
	Queue<Integer> queue = new LinkedList<>();
	public int BFS(int s, int e){
		ch = new int[10001]; // 문제에서 제시한 최대길이
		ch[s] = 1;
		queue.offer(s);
		int level = 0;
		while (!queue.isEmpty()) {
			int length = queue.size();
			for(int i=0; i<length; i++) {
				int x = queue.poll();
				// if(x==e) return level;
				for(int j=0; j<3; j++) {
					int next = x+distance[j];
					if(next==e) return level+1;
					if(next >= 1 && next <= 10000 && ch[next] == 0) {
						ch[next] = 1;
						queue.offer(next);
					}
				}
			}
			level++;
		}
		return 0;
	}

	public static void main(String[] args) {
		N7_08_송아지찾기 T = new N7_08_송아지찾기();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt(); // 내 위치
		int e = kb.nextInt(); // 송아지 위치
		System.out.println(T.BFS(s, e));
	}
}
