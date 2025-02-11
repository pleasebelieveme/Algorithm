package inflearn.N5;

import java.util.Scanner;
import java.util.Stack;

/*
(()(()))(()
 */
public class N5_01_올바른괄호 {
	// 스택문제!
	public String solution(String s) {
		String answer = "NO";
		Stack<Character> stk = new Stack<>();
		for (char x : s.toCharArray()) {
			if(x=='(') stk.push(x);
			else if (x==')') {
				if(stk.isEmpty()) return answer = "NO";
				else stk.pop();
			}
		}
		if(stk.isEmpty()) answer = "YES";

		return answer;
	}

	// 강의풀이
	public String solutionYou(String s) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for (char x : s.toCharArray()) {
			if(x=='(') stack.push( x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	public static void main(String[] args) {
		N5_01_올바른괄호 T = new N5_01_올바른괄호();
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		System.out.println(T.solutionYou(s));
	}
}
