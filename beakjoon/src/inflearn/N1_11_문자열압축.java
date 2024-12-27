package inflearn;

import java.util.Scanner;

public class N1_11_문자열압축 {
	public String solution(String str) {
		// // 내가 푼거
		// String answer = "";
		// char[] c = str.toCharArray();
		// int cnt = 1;
		// for (int i = 0; i < str.length()-1; i++) {
		// 	if (c[i] == c[i+1]) {
		// 		cnt++;
		// 	} else {
		// 		answer += c[i];
		// 		if (cnt > 1) {
		// 			answer += cnt;
		// 			cnt = 1;
		// 		}
		// 	}
		// 	if(i == str.length()-2) {
		// 		answer += c[i+1];
		// 		if (cnt > 1) answer += cnt;
		// 	}
		// }
		// return answer;

		// 해답1
		String answer = "";
		str = str + " "; // 빈문자열 추가
		int cnt = 1;
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) cnt++;
			else {
				answer += str.charAt(i);
				if(cnt > 1) {
					answer += Integer.toString(cnt); // string 변환, String.valueOf(cnt)
				}
				cnt = 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		N1_11_문자열압축 T = new N1_11_문자열압축();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
