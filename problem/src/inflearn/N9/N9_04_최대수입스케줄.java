package inflearn.N9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
	public int money;
	public int deadline;
	Lecture(int money, int deadline) {
		this.money = money;
		this.deadline = deadline;
	}
	@Override
	public int compareTo(Lecture ob) {
		return ob.deadline - this.deadline;
	}
}

public class N9_04_최대수입스케줄 {
	static int n, max = Integer.MIN_VALUE;
	public int solution(ArrayList<Lecture> arr) {
		int answer = 0;
		// PriorityQueue pQ = new PriorityQueue<>(); // poll()할때 작은값을 반환
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); // poll()할때 큰값을 반환
		Collections.sort(arr);
		int j = 0;
		for(int i=max; i>=1; i--) {
			for( ; j<n; j++) {
				if(arr.get(j).deadline < i) break;
				pQ.offer(arr.get(j).money);
			}
			if(!pQ.isEmpty()) answer += pQ.poll();
		}
		return answer;
	}
	public static void main(String[] args) {
		N9_04_최대수입스케줄 T = new N9_04_최대수입스케줄();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // 의뢰온 강좌 수
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int m = kb.nextInt(); // 금액
			int d = kb.nextInt(); // 주어진 시간
			arr.add(new Lecture(m, d));
			if(d > max) max = d;
		}
		System.out.println(T.solution(arr));
	}

}
