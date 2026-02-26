import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 우리가 찾아가야 할 방 번호
        int count = 1; // 몇 개의 방을 거치는지
        int range = 1; // 현재 층까지의 최대 방 번호

        while (range < N) {
            // 다음 층의 최대 번호는 [이전 최대 + (6 * 현재 층수)]
            range = range + (6*count);
            count++;
        }

        System.out.println(count);
    }
}