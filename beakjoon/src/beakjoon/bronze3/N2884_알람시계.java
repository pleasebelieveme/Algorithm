package beakjoon.bronze3;

import java.util.Scanner;

public class N2884_알람시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M >= 45) {
            M = M - 45;
        } else {
            M = M + 15;
            if(H == 0) {
                H = 23;
            } else {
                H = H - 1;
            }
        }
        System.out.print(H + " " + M);
    }
}
