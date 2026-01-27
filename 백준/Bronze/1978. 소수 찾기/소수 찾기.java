import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();
            if (number < 2) continue;
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) answer++;
        }
        System.out.println(answer);
    }
}
