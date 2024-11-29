package beakjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N10871_X보다작은수 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 배열의 크기
        int X = sc.nextInt();  // 비교할 값

        int[] arr = new int[N];

        // 배열에 N개의 값 입력 받기
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Scanner를 사용하여 출력
        scanner(N, X, arr);

        // StringBuilder를 사용하여 출력
        stringBuilder(N, X, arr);

        // BufferedReader와 StringTokenizer를 사용하여 출력
        stringTokenizerWithBufferedReader(N, X, arr);

        // Scanner 닫기
        sc.close();
    }

    // Scanner를 사용하여 X보다 작은 값들만 출력하는 함수
    public static void scanner(int N, int X, int[] arr) {
        for (int i = 0; i < N; i++) {
            if (arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // StringBuilder를 사용하여 X보다 작은 값들만 출력하는 함수
    public static void stringBuilder(int N, int X, int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (arr[i] < X) {
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb.toString().trim());  // 마지막 공백 제거
    }

    // BufferedReader와 StringTokenizer를 사용하여 X보다 작은 값들만 출력하는 함수
    public static void stringTokenizerWithBufferedReader(int N, int X, int[] arr) throws IOException {
        // BufferedReader로 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄은 이미 입력 받았기 때문에 두 번째 줄의 값들을 받아옵니다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        // X보다 작은 값들만 StringBuilder에 추가
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (value < X) {
                sb.append(value).append(' ');
            }
        }

        // 결과 출력
        System.out.println(sb.toString().trim());  // 마지막 공백 제거
    }
}
