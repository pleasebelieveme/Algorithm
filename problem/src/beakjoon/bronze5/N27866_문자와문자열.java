package beakjoon.bronze5;

import java.util.Scanner;

public class N27866_문자와문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();

        char A = S.charAt(i-1);
        System.out.println(A);
    }
}
