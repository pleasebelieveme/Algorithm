package beakjoon.bronze2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class N3052_나머지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;
        // 배열생성
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            A = sc.nextInt();
            arr[i] = A % 42;
        }
        // 중복 제거를 위해 Set 사용
        Set<Integer> result = new HashSet<>();
        for (int num : arr) {
            result.add(num); // Set에 추가하면 중복은 자동으로 제거
        }

        // 고유한 나머지 개수 출력
        System.out.println(result.size());
    }
}
