package inflearn.N5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N5_07_교육과정설계 {
	public String solution(String mustOrder, String myOrder) {
		String answer = "NO";
		int length = mustOrder.length();
		Queue q = new LinkedList();
		for (int i = 0; i < mustOrder.length(); i++) {
			q.add(mustOrder.charAt(i));
		}
		for (Character c : myOrder.toCharArray()) {
			char tmp = (char) q.peek();
			if (!(tmp==c)) {}
			else if (tmp==c) {
				q.poll();
				length--;
			}
			if(q.isEmpty()) break;
		}
		if (length==0) answer="YES";
		return answer;
	}

	// 강의풀이
	public String solutionYou(String mustOrder, String myOrder) {
		// 변수명 필수과목=need, 수강과목=plan
		String answer = "YES";
		Queue q = new LinkedList();
		for (char c : mustOrder.toCharArray()) q.offer(c);
		for (char c : myOrder.toCharArray()) {
			if(q.contains(c)) {
				if(c!=(char)q.poll()) return answer = "NO";
			}
		}
		if(!q.isEmpty()) return answer="NO";
		return answer;
	}
	public static void main(String[] args) {
		N5_07_교육과정설계 T = new N5_07_교육과정설계();
		Scanner sc = new Scanner(System.in);
		String mustOrder = sc.next();
		String myOrder = sc.next();
		System.out.println(T.solutionYou(mustOrder, myOrder));
	}
}
