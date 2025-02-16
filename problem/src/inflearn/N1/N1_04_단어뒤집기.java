package inflearn.N1;

import java.util.ArrayList;
import java.util.Scanner;

public class N1_04_단어뒤집기 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0;
			int rt = x.length()-1;
			while(lt < rt){
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s); // char타입을 String타입으로
			answer.add(tmp);
		}
		// for(String x : str) {
		// 	String tmp = new StringBuilder(x).reverse().toString();
		// 	answer.add(tmp);
		// }
		return answer;
	}

	public static void main(String[] args) {
		N1_04_단어뒤집기 T = new N1_04_단어뒤집기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		for (String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}
}
