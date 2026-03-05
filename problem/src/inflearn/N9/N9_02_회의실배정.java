package inflearn.N9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
	public int start, end;
	Time(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(Time time) {
		if(this.end == time.end) return this.start-time.start;
		else return this.end-time.end;
	}
}
public class N9_02_회의실배정 {
	public int solution(ArrayList<Time> arr, int n) {
		int count = 0;
		Collections.sort(arr);
		int endTime = 0;
		for(Time ob : arr) {
			if(ob.start >= endTime) {
				count++;
				endTime = ob.end;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		N9_02_회의실배정 T = new N9_02_회의실배정();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Time(x, y));
		}
		System.out.println(T.solution(arr, n));
	}
}
