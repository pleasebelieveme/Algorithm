package inflearn;

import java.util.Scanner;

public class N1_07_회문문자열 {
	public String solution(String str) {
		String answer = null;
		char[] c = str.toUpperCase().toCharArray();
		int lt = 0;
		int rt = str.length()-1;
		while (lt < rt) {
			if(c[lt] == c[rt]) {
				lt++;
				rt--;
			} else {
				answer = "NO";
				break;
			}
			answer = "YES";
		}
		return answer;
	}

	public static void main(String[] args) {
		N1_07_회문문자열 T = new N1_07_회문문자열();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
