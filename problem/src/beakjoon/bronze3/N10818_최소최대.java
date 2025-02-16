package beakjoon.bronze3;

import java.util.Scanner;

public class N10818_최소최대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        // 첫 번째 값으로 초기화
        arr[0] = sc.nextInt();
        int max = arr[0], min = arr[0];

        // 나머지 값을 비교
        for (int i = 1; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println(min + " " + max);
    }
}
