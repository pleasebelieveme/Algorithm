package inflearn.N1;

import java.util.Scanner;

public class N1_05_특정문자뒤집기 {
	public String solution(String str) {
		String answer;
		int lt = 0; // left
		int rt = str.length()-1; // right
		char[] c = str.toCharArray();
		while (lt < rt) {
			// if(c[lt] >= 'a' && c[lt] <= 'Z' && c[rt] >= 'a' && c[rt] <= 'Z') { // a~Z사이에는 특수문자가 포함되어 있다
			if(!Character.isAlphabetic(c[lt])) lt++;
			else if(!Character.isAlphabetic(c[rt])) rt--;
			else{
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
		}
		return answer = String.valueOf(c); // char[]을 String으로
	}
	public static void main(String[] args) {
		N1_05_특정문자뒤집기 T = new N1_05_특정문자뒤집기();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
