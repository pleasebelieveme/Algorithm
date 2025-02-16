package beakjoon.bronze5;

import java.util.Scanner;

public class N9498_시험성적 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int I = sc.nextInt();
        if (I >= 90) System.out.println("A");
        else if (I >= 80) System.out.println("B");
        else if (I >= 70) System.out.println("C");
        else if (I >= 60) System.out.println("D");
        else System.out.println("F");
    }
}
