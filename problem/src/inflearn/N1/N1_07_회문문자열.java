package inflearn.N1;

import java.util.Scanner;

public class N1_07_회문문자열 { // 팰린드럼
	public String solution(String str) {

		// 1.
		// String answer = null;
		// char[] c = str.toUpperCase().toCharArray();
		// int lt = 0;
		// int rt = str.length()-1;
		// while (lt < rt) {
		// 	if(c[lt] == c[rt]) {
		// 		lt++;
		// 		rt--;
		// 	} else {
		// 		answer = "NO";
		// 		break;
		// 	}
		// 	answer = "YES";
		// }
		// return answer;

		// 2.
		// String answer = "YES";
		// int len = str.length();
		// str = str.toUpperCase();
		// for (int i = 0; i < len/2 ; i++) {
		// 	if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
		// }
		// return answer;

		// 3.
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		return answer;
	}

	public static void main(String[] args) {
		N1_07_회문문자열 T = new N1_07_회문문자열();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
