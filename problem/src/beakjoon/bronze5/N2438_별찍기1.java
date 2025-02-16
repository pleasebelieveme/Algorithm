package beakjoon.bronze5;

import java.util.Scanner;

public class N2438_별찍기1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String star = "*";
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}
