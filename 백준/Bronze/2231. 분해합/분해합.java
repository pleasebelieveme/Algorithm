import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = Math.max(1, N - 54); i <= N; i++) {
            int sum = i;
            int temp = i;
            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if(sum == N) {
                answer = i;
                break;
            }
        }

        System.out.print(answer);
    }
}
