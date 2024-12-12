package beakjoon.bronze2;

import java.util.Scanner;

public class N8958_OX퀴즈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt(); // 테스트 케이스 개수 입력
        sc.nextLine(); // 버퍼 비우기

        for (int i = 0; i < test; i++) {
            String a = sc.nextLine(); // 한 줄씩 입력받음
            int score = 0; // 총 점수
            int currentStreak = 0; // 연속된 O의 개수

            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == 'O') {
                    currentStreak++; // 연속된 O 증가
                    score += currentStreak; // 현재 연속 점수 추가
                } else {
                    currentStreak = 0; // X가 나오면 연속 끊김
                }
            }
            System.out.println(score); // 각 테스트 케이스의 점수 출력
        }
    }
}
