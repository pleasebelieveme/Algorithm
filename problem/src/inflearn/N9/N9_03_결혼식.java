package inflearn.N9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class N9_03_결혼식 {
	static class Time implements Comparable<Time> {
		public int time;
		public char state; // 왔는지 갔는지
		Time(int time, char state) {
			this.time = time;
			this.state = state;
		}
		@Override
		public int compareTo(Time ob) {
			if(this.time == ob.time) return this.state - ob.state; // 시간이 같으면 state의 알파벳으로 구분(start, end)
			else return this.time - ob.time;
		}
	}
	public int solution(ArrayList<Time> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int count = 0;
		for(Time ob : arr) {
			if(ob.state == 's') count++;
			else count--;
			answer = Math.max(answer, count);
		}
		return answer;
	}
	public static void main(String[] args) {
		N9_03_결혼식 T = new N9_03_결혼식();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 인원수
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int startTime = kb.nextInt();
			int endTime = kb.nextInt();
			arr.add(new Time(startTime, 's'));
			arr.add(new Time(endTime, 'e'));
		}
		System.out.println(T.solution(arr));
	}
}
