package beakjoon.bronze2;

import java.util.Scanner;

public class N10809_알파벳찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        char[] alphabetArr = new char[26];

        // 알파벳 배열 생성
        for (int i = 0; i < 26 ; i++) {
            alphabetArr[i] = (char) ('a' + i);
        }
        // 입력받은 S랑 a-z가 For문으로 돌면서 비교해서 같은 값이 있으면 idx +1
        for (int i = 0; i < 26; i++) {
            String tmp = String.valueOf(alphabetArr[i]);
            int idx = S.indexOf(tmp);
            // 없으면 -1, 있으면 해당위치 값
            System.out.print(idx + " ");

        }
    }
}
