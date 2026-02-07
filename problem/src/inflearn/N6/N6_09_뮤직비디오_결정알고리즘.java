package inflearn.N6;

import java.util.Arrays;
import java.util.Scanner;

public class N6_09_뮤직비디오_결정알고리즘 {
	public int count(int[] arr, int capactiry) {
		int cnt = 1, sum = 0; // DVD장수, DVD에서 노래가 차지하는 용량
		for (int x : arr) {
			if(sum+x > capactiry) {
				cnt++;
				sum = x;
			}
			else sum += x;
		}
		return cnt;
	}

	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		// 리덕션 찾아보기!
		int lt = Arrays.stream(arr).max().getAsInt(); // Optional<Integer>로 반환하기에 getAsInt() 함수가 필요!
		int rt = Arrays.stream(arr).sum(); // sum()은 해당 타입으로 반환.
		while (lt <= rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid)<=m) {
				answer = mid;
				rt = mid-1;
			}
			else  lt = mid+1;
		}
		return answer;
	}
	public static void main(String[] args) {
		N6_09_뮤직비디오_결정알고리즘 T = new N6_09_뮤직비디오_결정알고리즘();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
