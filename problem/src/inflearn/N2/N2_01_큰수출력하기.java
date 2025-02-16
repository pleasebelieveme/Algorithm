package inflearn.N2;

import java.util.ArrayList;
import java.util.Scanner;

public class N2_01_큰수출력하기 {
	public ArrayList<Integer> solution(int num, int[] numArray) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(numArray[0]);
		for (int i = 1; i < numArray.length; i++) {
			if(numArray[i-1] < numArray[i]) answer.add(numArray[i]);
		}
		return answer;
	}
	public static void main(String[] args) {
		N2_01_큰수출력하기 T = new N2_01_큰수출력하기();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] numArray = new int[num];
		for (int i = 0; i < num; i++) {
			numArray[i] = kb.nextInt();
		}
		for(int x : T.solution(num, numArray)) {
			System.out.print(x + " ");
		}
	}
}
