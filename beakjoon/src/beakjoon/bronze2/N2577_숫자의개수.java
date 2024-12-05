package beakjoon.bronze2;

import java.util.Scanner;

public class N2577_숫자의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int arr[] = new int[10];
        String r1 = (A * B * C) +"";
        int r2 = 0;
        for (int i = 0; i < r1.length(); i++) {
            r2 = Integer.parseInt(String.valueOf(r1.charAt(i)));
            arr[r2]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

    }
}
