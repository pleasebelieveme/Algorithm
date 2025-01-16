package beakjoon.bronze4;

import java.util.Scanner;
public class N11720_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 자리수가 너무 길면 int형으로 못 받을 수 있다.
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i=0; i<cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        System.out.print(sum);
        long l = Long.MAX_VALUE;
        // System.out.println("l = " + l); // 9223372036854775807
    }
}
