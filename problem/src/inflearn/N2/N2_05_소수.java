package inflearn.N2;

import java.util.Scanner;

// 소수(에라토스테네스 체)
public class N2_05_소수 {
	public int solutionMe(int n) {
		int answer = 0; // 2하고 3포함
		for (int i = 2; i <= n ; i++) {
			if(i==2) answer += 1;
			else if(i==3) answer += 1;
			else if(i%2!=0 && i%3!=0) answer += 1; // 2와 3이 중복카운트?
		}
		return answer;
	}
	// 강의풀이
	// 에라토스테네스 체 : 숫자를 만나면 그 숫자의 배수를 체크하여 배제시킨다
	public int solution(int n) {
		int answer = 0;
		int[] ch = new int[n+1];
		for (int i = 2; i <= n; i++) {
			if(ch[i] == 0) {
				answer++;
				System.out.println("i = " + i);
				for (int j = i; j <= n; j=j+i) ch[j] = 1;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		N2_05_소수 T = new N2_05_소수();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solutionMe(n));
	}
}
