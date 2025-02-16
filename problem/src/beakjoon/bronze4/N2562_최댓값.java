package beakjoon.bronze4;

import java.util.Scanner;

public class N2562_최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[9];
        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}
