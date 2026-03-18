package inflearn.N10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class N10_04_가장높은탑쌓기 {
	static class Brick implements Comparable<Brick> {
		public int size, height, weight;
		Brick(int size, int height, int weight) {
			this.size = size;
			this.height = height;
			this.weight = weight;
		}
		@Override
		public int compareTo(Brick ob) {
			return ob.size-this.size;
		}
	}

	static int[] dy;
	public int solution(ArrayList<Brick> arr) {
		int answer = 0;
		Collections.sort(arr);
		dy[0] = arr.get(0).height;
		answer = dy[0];
		for(int i=1; i<arr.size(); i++) {
			int maxHeight = 0;
			for(int j=i-1; j>=0; j--) {
				if(arr.get(j).weight>arr.get(i).weight && dy[j]>maxHeight) {
					maxHeight = dy[j];
				}
			}
			dy[i] = maxHeight+arr.get(i).height;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	public static void main(String[] args) {
		N10_04_가장높은탑쌓기 T = new N10_04_가장높은탑쌓기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Brick> arr = new ArrayList<>();
		dy = new int[n+1];
		for(int i=0; i<n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.add(new Brick(a, b, c));
		}
		System.out.println(T.solution(arr));
	}
}
