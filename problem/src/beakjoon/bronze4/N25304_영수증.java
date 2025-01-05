package beakjoon.bronze4;

import java.util.Scanner;

public class N25304_영수증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0; 
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a*b;
        }
        if (sum == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
