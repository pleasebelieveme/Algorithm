package inflearn;

import java.util.Scanner;

public class N1_06_중복문자제거 {
	public String solution(String str) {
		String answer = "";
		for (int i = 0; i <str.length(); i++) {
			// System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i))==i) answer += String.valueOf(str.charAt(i));
		}
		return answer;
	}

	public static void main(String[] args) {
		N1_06_중복문자제거 T = new N1_06_중복문자제거();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
