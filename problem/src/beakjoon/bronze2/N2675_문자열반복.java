package beakjoon.bronze2;

import java.util.Scanner;

public class N2675_문자열반복 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수 입력

        for (int t = 0; t < T; t++) {
            int R = sc.nextInt(); // 반복 횟수
            String S = sc.next(); // 문자열

            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    System.out.print(S.charAt(i));
                }
            }
            System.out.println(); // 각 테스트 케이스 끝에서 줄 바꿈
        }
        sc.close(); // Scanner 닫기
    }
}
