package inflearn.N5;

import java.util.Scanner;
import java.util.Stack;

/*
()(((()())(())()))(())
 */
public class N5_05_쇠막대기 {
	public int solution(String s) {
		int answer = 0;
		Stack<Character> stk = new Stack<>();
		char[] c = s.toCharArray();
		stk.push(c[0]);
		for (int i = 1; i < c.length; i++) {
			if(c[i]=='(') stk.push(c[i]);
			else {
				if(c[i-1]=='(') {
					stk.pop();
					answer += stk.size();
				}
				else {
					stk.pop();
					answer += 1;
				}
			}
		}


		return answer;
	}

	// 강의풀이
	public int solutionYou(String s) {
		int answer = 0;
		Stack<Character> stk = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='(') stk.push('(');
			else {
				stk.pop();
				if(s.charAt(i-1)=='(') answer += stk.size();
				else answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		N5_05_쇠막대기 T = new N5_05_쇠막대기();
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		System.out.println(T.solution(s));
	}
}
