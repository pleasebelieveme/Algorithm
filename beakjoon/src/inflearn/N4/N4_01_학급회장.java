package inflearn.N4;

import java.util.HashMap;
import java.util.Scanner;

/*
15
BACBACCACCBDEDE
 */
public class N4_01_학급회장 {
	public String solution(int n, String arr) {
		String answer="";
		int[] cnt = new int[4];
		char[] cArr = arr.toCharArray();
		int max = 0;
		int win = 0;
		for (int i = 0; i < cArr.length; i++) {
			switch (cArr[i]) {
				case 'A': {
					cnt[0] += 1;
					break;
				}
				case 'B': {
					cnt[1] += 1;
					break;
				}
				case 'C': {
					cnt[2] += 1;
					break;
				}
				case 'D': {
					cnt[3] += 1;
					break;
				}
			}
		}

		// for(int x : cnt)
		// 	System.out.println(x);

		for (int i = 0; i < 4; i++) {
			if(cnt[i]>max) {
				win = i;
				max = cnt[i];
			}
		}
		// System.out.println("win = " + win);
		switch (win) {
			case 0: {
				answer = "A";
				break;
			}
			case 1: {
				answer = "B";
				break;
			}
			case 2: {
				answer = "C";
				break;
			}
			case 3: {
				answer = "D";
				break;
			}
		}

		return answer;
	}

	// 강의풀이 해시맵사용하기
	public char solutionYou(int N, String arr) {
		char answer = ' ';
		int max = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : arr.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		// System.out.println(map.containsKey('A')); // 리턴값 boolean
		// System.out.println(map.size()); // 리턴값 int
		// System.out.println(map.remove('A')); // 리턴값 key의 밸류값 리턴
		for(char x : map.keySet()) {하
			// System.out.println(x + " " + map.get(x));
			if(map.get(x)>max) {
				max=map.get(x);
				answer=x;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		N4_01_학급회장 T = new N4_01_학급회장();
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		String arr = kb.next();
		// System.out.println("arr = " + arr);
		System.out.println(T.solutionYou(N, arr));
	}
}
