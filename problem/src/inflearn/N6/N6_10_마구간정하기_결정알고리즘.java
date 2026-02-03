package inflearn.N6;

import java.util.Arrays;
import java.util.Scanner;

public class N6_10_마구간정하기_결정알고리즘 {
	public int count(int[] arr, int dist) {
		int cnt = 1;
		int ep = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]-ep>=dist) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}

	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n-1];
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid)>=c) {
				answer = mid;
				lt = mid+1;
			} else {
				rt = mid-1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		N6_10_마구간정하기_결정알고리즘 T = new N6_10_마구간정하기_결정알고리즘();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int c = kb.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++){
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, c, arr));
	}
}
