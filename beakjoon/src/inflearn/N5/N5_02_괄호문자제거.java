package inflearn.N5;

import java.util.Scanner;
import java.util.Stack;

/*
(A(BC)D)EF(G(H)(IJ)K)LM(N)
 */
public class N5_02_괄호문자제거 {
	public String solution(String s) {
		String answer = "";
		Stack<Character> stk = new Stack<>();
		for (char x : s.toCharArray()) {
			if (x == ')') {  // 닫는 괄호를 만나면 여는 괄호까지 제거
				while (!stk.isEmpty() && stk.peek() != '(') {
					stk.pop();
				}
				if (!stk.isEmpty()) stk.pop(); // 여는 괄호 '(' 제거
			} else {
				stk.push(x);
			}
		}
		for (int i = 0; i < stk.size(); i++) {
			answer += stk.get(i);
		}
		return answer;
	}

	// 강의풀이
	public String solutionYou(String s) {
		String answer = "";
		Stack<Character> stk = new Stack<>();
		for (char x : s.toCharArray()) {
			if(x==')') {
				while (stk.pop() != '(');
			}
			else stk.push(x);
		}
		for (int i = 0; i < stk.size(); i++) {
			answer += stk.get(i);
		}
		return answer;
	}
	public static void main(String[] args) {
		N5_02_괄호문자제거 T = new N5_02_괄호문자제거();
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		System.out.println(T.solution(s));
	}
}
