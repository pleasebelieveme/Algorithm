package beakjoon.bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class N4153_직각삼각형 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        while (true) {
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }

            // 0 0 0값이 들어오면 종료할 수 있도록 코딩
            if (a[0] == 0 && a[1] == 0 && a[2] == 0) {
                break;
            }
            Arrays.sort(a);
            int s = a[0]*a[0] + a[1]*a[1];
            int l = a[2]*a[2];
            if (s == l) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}
