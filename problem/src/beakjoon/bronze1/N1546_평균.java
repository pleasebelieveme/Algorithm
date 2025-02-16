package beakjoon.bronze1;

import java.util.Scanner;

public class N1546_평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        long sum = 0;
//        int[] score = new int[N];
//        for(int i=0; i<N; i++) {
//            score[i] = sc.nextInt();
//        }
//        for (int i=0; i<N; i++) {
//            if (score[i] > max) max = score[i];
//            sum += score[i];
//        }
        for(int i=0; i<N; i++) {
           int temp = sc.nextInt();
           if (temp>max) max = temp;
           sum += temp;
        }
        System.out.println(sum*100.0/max/N);
    }
}
