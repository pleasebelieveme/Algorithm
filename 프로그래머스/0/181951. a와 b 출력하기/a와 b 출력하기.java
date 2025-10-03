import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;  // 입력 없으면 그냥 종료
        int a = sc.nextInt();

        if (!sc.hasNextInt()) return;  // b가 없으면 종료
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}