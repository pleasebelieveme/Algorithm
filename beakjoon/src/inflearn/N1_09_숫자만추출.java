package inflearn;

import java.util.Scanner;

public class N1_09_숫자만추출 {
	public int solution(String str) {
		// int answer = 0;

		// for (int i = 0; i < str.length(); i++) {
		// 	if(str.charAt(i) >=48 && str.charAt(i) <=57) { // char 0~9(48~57)
		// 		answer = answer * 10 + (str.charAt(i)-48);
		// 	}
		// }

		// for(char x : str.toCharArray()) {
		// 	if(x >= 48 && x <= 57) {
		// 		answer = answer * 10 + (x-48);
		// 	}
		// }

		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		N1_09_숫자만추출 T = new N1_09_숫자만추출();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
