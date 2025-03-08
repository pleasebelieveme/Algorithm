package inflearn.N6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class N6_05_중복확인 {
	public String solution(int n, int[] arr) {
		String answer = "U";
		HashSet<Integer> set = new HashSet<>();
		for (int i : arr) {
			if (set.contains(i)) {
				return answer = "D";
			}
			set.add(i);
		}
		return answer;
	}

	// 해쉬맵(시간복잡도 n)을 사용하는게 효율적이나 정렬(시간복잡도 nlogn)로도 풀 수 있다는 것을 보여주기 위해 문제에 삽입
	public String solutionYou(int n, int[] arr) {
		String answer = "U";
		Arrays.sort(arr); // 내림차순은 람다사용
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) return answer = "D";
		}
		return answer;
	}
	public static void main(String[] args) {
		N6_05_중복확인 T = new N6_05_중복확인();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}
}
