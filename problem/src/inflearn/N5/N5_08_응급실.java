package inflearn.N5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N5_08_응급실 {

	// 위험도가 같은 환자가 있어서 환자번호를 붙여주지 않으면 해결불가
	public int solution(int n, int m, int[] risk) {
		int answer = -1;
		int cnt = 0;
		Queue<Integer> q = new LinkedList<>();
		for(int i : risk) q.add(i);
		while (!q.isEmpty()) {
			int tmp = q.poll();
			boolean nextRisk = false;
			for (int i : q) {
				if(tmp < i) {
					nextRisk = true;
				}
			}
			if(nextRisk==true) q.offer(tmp);
			else {
				cnt++;
				if(tmp==risk[m]) answer = cnt;
			}
		}
		return answer;
	}

	// 강의풀이
	class Person {
		int id;
		int priority;
		public Person(int id, int priority) {
			this.id=id;
			this.priority=priority;
		}
	}
	public int solutionYou(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			q.offer(new Person(i, arr[i]));
		}
		while (!q.isEmpty()) {
			Person tmp = q.poll();
			for (Person x : q) {
				if(x.priority> tmp.priority) {
					q.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==m) return answer;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		N5_08_응급실 T = new N5_08_응급실();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] risk = new int[n];
		for (int i = 0; i < n; i++) {
			risk[i] = sc.nextInt();
		}
		System.out.println(T.solutionYou(n, m, risk));
	}
}
