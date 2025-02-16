package inflearn.N1;

import java.util.Scanner;

public class N1_12_암호 {
	public String solution(int n, String s) {
		// 1. 문자열을 7개씩 자른다
		// 2. 문자를 2진수로 변환한다
		// 3. 2진수를 10진수로 변환한다
		// 4. 아스키코드값을 문자로 치환하여 문자를 합체한다.
		String answer = "";
		String binary = "";
		for (int i = 0; i < n; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char) num;
			s = s.substring(7);
			// for (int j = 0; j < 7; j++) {
			// 	if(tmp.charAt(j) == '#') binary += "1";
			// 	else binary += "0";
			// }
		}
		return answer;
	}

	public static void main(String[] args) {
		N1_12_암호 T = new N1_12_암호();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s = kb.next();
		System.out.println(T.solution(n, s));
	}
}
