package inflearn.N4;

import java.util.HashMap;
import java.util.Scanner;

/*
AbaAeCe
baeeACA
 */
public class N4_02_아나그램해쉬 {
	/*
	아래만 YES가 나옴
ABCDqtqtqEFqGHIJKLMNOPQRSTUVWetagdgXYabcdefghijklmnopqrstuwxyz
aBcdewrqwtqFghIJklMnOpqrsTuegagaeVxyYAbCDEfGHijKLmNoPQRStUwWXz
	 */
	public String solution(String n, String k) {
		String answer = "NO";
		HashMap<Character, Integer> nMap = new HashMap<>();
		HashMap<Character, Integer> kMap = new HashMap<>();
		for (char x : n.toCharArray()) {
			// System.out.println("x = " + x);
			nMap.put(x, nMap.getOrDefault(x, 0)+1);
			// System.out.println("nMap = " + nMap.keySet() + " " + nMap.get(x));
		}
		for (char x : k.toCharArray()) {
			kMap.put(x, kMap.getOrDefault(x, 0)+1);
		}
		// for(char x : nMap.keySet()) {
		// 	System.out.println("n = " + x + " " + nMap.get(x));
		// }
		// for(char x : kMap.keySet()) {
		// 	System.out.println("k = " + x + " " + kMap.get(x));
		// }
		// if(nMap.size() != kMap.size()) return answer; // 개수는 일치하기 때문에 필요없음
		for (char x : nMap.keySet()) {
			if(kMap.containsKey(x) == true && kMap.get(x) == nMap.get(x)) {
				answer = "YES";
			}
			else return answer = "NO";
			// System.out.println("boolean = " + kMap.containsKey(x));
			// System.out.println("count = " + (kMap.get(x) == nMap.get(x)));
			// System.out.println();
		}
		return answer;
	}

	public String solutionYou(String n, String k) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : n.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char x : k.toCharArray()) {
			if(!map.containsKey(x) || map.get(x)==0) answer="NO";
			map.put(x, map.get(x)-1);
			// System.out.println("x = " + x);
			// System.out.println(map.containsKey(x));
			// System.out.println();
		}
		return answer;
	}
	public static void main(String[] args) {
		N4_02_아나그램해쉬 T = new N4_02_아나그램해쉬();
		Scanner kb = new Scanner(System.in);
		String n = kb.next();
		String k = kb.next();
		// // 문자열을 문자 배열로 변환
		// char[] charArray = n.toCharArray();
		//
		// // 문자 배열 정렬
		// Arrays.sort(charArray);
		//
		// // 한 글자씩 출력
		// for (char c : charArray) {
		// 	System.out.print(c);
		// }
		// System.out.println();
		// char[] charArray2 = k.toCharArray();
		//
		// // 문자 배열 정렬
		// Arrays.sort(charArray2);
		//
		// // 한 글자씩 출력
		// for (char c : charArray2) {
		// 	System.out.print(c);
		// }
		System.out.println(T.solution(n, k));
	}
}
