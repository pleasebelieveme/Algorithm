package inflearn.N9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class N9_1_씨름선수 {
	static class Body implements Comparable<Body> {
		public int height, weight;
		Body(int height, int weight) {
			this.height = height;
			this.weight = weight;
		}
		@Override
		public int compareTo(Body body) {
			return body.height - this.height;
		}
	}

	public int solution(ArrayList<Body> arr, int n) {
		int count = 0;
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		for(Body object : arr) {
			if(object.weight > max) {
				max = object.weight;
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		N9_1_씨름선수 T = new N9_1_씨름선수();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int height = kb.nextInt();
			int weight = kb.nextInt();
			arr.add(new Body(height, weight));
		}
		System.out.println(T.solution(arr, n));
	}
}
