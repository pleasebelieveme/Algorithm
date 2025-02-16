package beakjoon.bronze5;

import java.util.Scanner;

public class N2475_검증수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            a[i] = a[i]*a[i];
            b += a[i];
        }
        System.out.println(b%10);

    }
}
