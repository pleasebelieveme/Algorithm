package inflearn.N1;

import java.util.Scanner;

public class N1_08_팰린드롬 {
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", ""); // 알파벳 대문자가 아니면(^) 빈문자열로
		String sb = new StringBuilder(str).reverse().toString();
		if(str.equals(sb)) return "YES";
		return answer;
	}

	public static void main(String[] args) {
		N1_08_팰린드롬 T = new N1_08_팰린드롬();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
