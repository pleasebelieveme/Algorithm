package inflearn.N2;

import java.util.ArrayList;
import java.util.Scanner;

public class N2_03_가위바위보 {
	public ArrayList<String> solution(int[] aArr, int[] bArr) {
		ArrayList<String> answer = new ArrayList<>();
		// 1가위, 2바위, 3보
		for (int i = 0; i < aArr.length; i++) {
			if(aArr[i] == 1 && bArr[i] == 2) answer.add("B");
			else if (aArr[i] == 1 && bArr[i] == 3) answer.add("A");
			else if (aArr[i] == 2 && bArr[i] == 1) answer.add("A");
			else if (aArr[i] == 2 && bArr[i] == 3) answer.add("B");
			else if (aArr[i] == 3 && bArr[i] == 1) answer.add("B");
			else if (aArr[i] == 3 && bArr[i] == 2) answer.add("A");
			else answer.add("D");
		}


		return answer;
	}
	// 강의풀이
	public String solution2(int[] aArr, int[] bArr) {
		String answer = "";
		for (int i = 0; i <aArr.length ; i++) {
			if(aArr[i] == bArr[i]) answer += "D";
			else if(aArr[i]==1 && bArr[i]==3) answer += "A";
			else if(aArr[i]==2 && bArr[i]==1) answer += "A";
			else if(aArr[i]==3 && bArr[i]==2) answer += "A";
			else answer += "B";
		}
		return answer;
	}

	public static void main(String[] args) {
		N2_03_가위바위보 T = new N2_03_가위바위보();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] aArr = new int[n];
		int[] bArr = new int[n];
		for (int i = 0; i < n; i++) aArr[i] = kb.nextInt();
		for (int i = 0; i < n; i++) bArr[i] = kb.nextInt();
		for (String s : T.solution(aArr, bArr)) System.out.println(s);

		//강의풀이
		for(char x : T.solution2(aArr, bArr).toCharArray()) System.out.println(x);
	}
}
