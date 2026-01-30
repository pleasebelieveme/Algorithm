import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int nFactorial = 1;
        int kFactorial = 1;
        int nkFactorial = 1;

        // N!
        for (int i = 1; i <= N; i++) {
            nFactorial *= i;
        }

        // K!
        for (int i = 1; i <= K; i++) {
            kFactorial *= i;
        }

        // (N-K)!
        for (int i = 1; i <= N - K; i++) {
            nkFactorial *= i;
        }

        int result = nFactorial / (kFactorial * nkFactorial);

        System.out.println(result);
    }
}
