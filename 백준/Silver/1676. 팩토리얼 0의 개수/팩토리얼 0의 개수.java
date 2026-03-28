import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        // 5의 배수의 개수를 세고, 25의 배수(5가 하나 더 있음), 125의 배수를 차례로 더함
        // 2는 많으니 셀 필요 없음.
        while (N >= 5) {
            count += N / 5;
            N /= 5;
        }

        System.out.println(count);
    }
}