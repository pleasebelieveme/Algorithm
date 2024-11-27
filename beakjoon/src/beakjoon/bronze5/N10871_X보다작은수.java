package beakjoon.bronze5;

import java.util.Scanner;

public class N10871_X보다작은수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 입력 받기
        int N = sc.nextInt();  // 배열의 크기
        int X = sc.nextInt();  // 비교할 값

        int[] arr = new int[N];

        // 배열에 N개의 값 입력 받기
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // arr을 사용하여 X보다 작은 값 출력
        for (int i = 0; i < N; i++) {
            if (arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }

        // 추가로 StringBuilder를 사용한 출력 예시
        // sb(N, X, arr);
    }

    // StringBuilder를 사용하여 X보다 작은 값들만 출력하는 함수
    public static void sb(int N, int X, int[] arr) {
        StringBuilder sb = new StringBuilder();

        // arr 배열에서 X보다 작은 값들 StringBuilder에 추가
        for (int i = 0; i < N; i++) {
            if (arr[i] < X) {
                sb.append(arr[i]).append(" ");
            }
        }

        // StringBuilder 결과 출력
        System.out.println(sb.toString().trim());  // 마지막 공백 제거
    }
}
