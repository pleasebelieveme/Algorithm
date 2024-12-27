package beakjoon.bronze3;

import java.util.Scanner;

public class N10250_ACM호텔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt(); // 호텔의 층 수
            int W = sc.nextInt(); // 호텔의 방 수 (가로)
            int N = sc.nextInt(); // 몇 번째 손님인지

            // 층 번호 계산
            int floor = (N % H == 0) ? H : N % H;

            // 호수 번호 계산
            int roomNumber = (N - 1) / H + 1;

            // 방 번호 출력 (층수 + 호수 형식)
            System.out.printf("\n%d%02d", floor, roomNumber); // %d 정수, %02d 2자리 정수 표현
        }

        sc.close();
    }
}
