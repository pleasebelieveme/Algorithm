package beakjoon.bronze4;

import java.util.Scanner;

public class N31403_ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println((A + B) -C);
        String D = A + "";
        String E = B + "";
        int F = Integer.parseInt(D+E)-C;
        System.out.println(F);
    }
}
