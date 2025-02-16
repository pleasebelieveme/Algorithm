package inflearn.N4;

import java.util.HashMap;
import java.util.Scanner;

/*
bacaAacba
abc
 */
public class N4_04_모든아나그램찾기 {
	public int solution(String s, String t) {
		int answer=0;
		HashMap<Character, Integer> sMap = new HashMap<>();
		HashMap<Character, Integer> tMap = new HashMap<>();
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		int lt = 0;
		for (int i = 0; i < tArr.length-1; i++) {
			sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0)+1);
		}
		for (int i = 0; i < tArr.length; i++) {
			tMap.put(tArr[i], tMap.getOrDefault(tArr[i], 0)+1);
		}
		for (int rt = tArr.length-1; rt < sArr.length; rt++) {
			sMap.put(sArr[rt], sMap.getOrDefault(sArr[rt], 0) + 1);
			if(sMap.equals(tMap)) answer++;
			sMap.put(sArr[lt], sMap.get(sArr[lt])-1);
			if(sMap.get(sArr[lt])==0) sMap.remove(sArr[lt]);
			lt++;
		}
		return answer;
	}

	// 강의풀이
	public int solutionYou(String n, String t) {
		int answer=0;
		HashMap<Character, Integer> nm = new HashMap<>();
		HashMap<Character, Integer> tm = new HashMap<>();
		for(char x : t.toCharArray()) tm.put(x, tm.getOrDefault(x, 0) + 1);
		int L = t.length()-1;
		for (int i = 0; i < L; i++) nm.put(n.charAt(i), nm.getOrDefault(n.charAt(i), 0)+1);
		int lt=0;
		for (int rt = L; rt < n.length(); rt++) {
			nm.put(n.charAt(rt), nm.getOrDefault(n.charAt(rt), 0)+1);
			if(nm.equals(tm)) answer++;
			nm.put(n.charAt(lt), nm.get(n.charAt(lt))-1);
			if(nm.get(n.charAt(lt))==0) nm.remove(n.charAt(lt));
			lt++;
		}
		return answer;
	}
	public static void main(String[] args) {
		N4_04_모든아나그램찾기 T = new N4_04_모든아나그램찾기();
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		String t = kb.nextLine();
		System.out.println(T.solutionYou(s, t));

	}
}
