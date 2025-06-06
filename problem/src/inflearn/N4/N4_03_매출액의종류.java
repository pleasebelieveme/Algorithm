package inflearn.N4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
7 4
20 12 20 10 23 17 10
 */
public class N4_03_매출액의종류 {
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap();
		int lt = 0;
		// 슬라이딩 윈도우 map 생성
		for (int i = 0; i < k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for (int rt = k-1; rt < n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
			lt++;
		}
		return answer;
	}
	public static void main(String[] args) {
		N4_03_매출액의종류 T = new N4_03_매출액의종류();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, k, arr)) System.out.print(x + " ");
	}
}
