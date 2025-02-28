package inflearn.N5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N5_06_공주구하기 {
	// 큐사용
	// offer() -> 자료 추가하기
	// poll() -> 자료 꺼내기
	// peek() -> 제일 앞에 있는 값을 확인
	// size() -> 갯수 확인
	// contain() -> x가 있는가? boolean반환
	public int solution(int n, int k) {
		Queue<Integer> q = new LinkedList<>();
		int answer = 0;
		
		// 큐리스트 생성
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}

		while (q.size() != 1) {
			for (int i = 0; i < k-1; i++) {
				Integer back = q.poll();
				q.offer(back);
			}
			q.poll();
		}
		return answer = q.poll();
	}

	// 강의풀이
	public int solutionYou(int n, int k) {
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>();
		for (int i = 1; i <= n; i++) Q.offer(i);
		while (!Q.isEmpty()){
			for (int i = 1; i < k; i++) Q.offer(Q.poll());
			Q.poll();
			if(Q.size()==1) answer = Q.poll();
		}

		return answer;
	}
	public static void main(String[] args) {
		N5_06_공주구하기 T = new N5_06_공주구하기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}
