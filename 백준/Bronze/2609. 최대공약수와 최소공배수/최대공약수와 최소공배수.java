import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 유클리드 호제법 적용(큰 수 % 작은 수 → 나머지 반복 → 나머지 0이면 끝)
        int a = num1;
        int b = num2;

        // 최대공약수 계산
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        int greatestCommonDivisor = a;

        // 최소공배수 계산
        int leastCommonMultiple = (num1 * num2) / greatestCommonDivisor;

        // 출력
        System.out.println(greatestCommonDivisor);
        System.out.println(leastCommonMultiple);
    }
}
