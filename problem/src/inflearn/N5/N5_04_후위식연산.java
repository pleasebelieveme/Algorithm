package inflearn.N5;

import java.util.Scanner;
import java.util.Stack;

/*
352+*9-
 */
public class N5_04_후위식연산 {
	public int solution(String s) {
		int answer = 0;
		int l = 0;
		int r = 0;
		Stack<Integer> stk = new Stack<>();
		for (char x : s.toCharArray()) {
			// System.out.println("x = " + x);
			if(x>=49 && x<=57) {
				stk.push(x-48);
			}
			else {
				r = stk.pop();
				l = stk.pop();
				switch (x) {
					case '+': {
						stk.push(l+r);
						break;
					}
					case '-': {
						stk.push(l-r);
						break;
					}
					case '*': {
						stk.push(l*r);
						break;
					}
					case '/': {
						stk.push(l/r);
						break;
					}
				}
			}
			// System.out.println(stk.toString());
		}
		return answer=stk.pop();
	}

	// 강의풀이
	public int solutionYou(String s) {
		int answer = 0;
		Stack<Integer> stk = new Stack<>();
		for (char x : s.toCharArray()) {
			if(Character.isDigit(x)) stk.push(x-48);
			else {
				int rt = stk.pop();
				int lt = stk.pop();
				if(x=='+') stk.push(lt+rt);
				else if(x=='-') stk.push(lt-rt);
				else if(x=='*') stk.push(lt*rt);
				else if(x=='/') stk.push(lt/rt);
			}
		}
		return answer=stk.get(0);
	}

	public static void main(String[] args) {
		N5_04_후위식연산 T = new N5_04_후위식연산();
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		System.out.println(T.solution(s));
	}
}
