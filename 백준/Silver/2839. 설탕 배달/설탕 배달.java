import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int totalBags = -1; // 기본값 -1 (못 만들 경우 대비)

        // 5kg 봉지의 최대 개수부터 시작해서 0개까지 줄여가며 탐색
        for (int fiveKg = N / 5; fiveKg >= 0; fiveKg--) {
            int remainingWeight = N - (fiveKg * 5);

            // 남은 무게가 3kg 봉지로 딱 나누어 떨어진다면?
            // 0%N = 0
            if (remainingWeight % 3 == 0) {
                totalBags = fiveKg + (remainingWeight / 3);
                break; // 가장 적은 봉지 개수를 찾았으므로 즉시 종료
            }
        }

        System.out.println(totalBags);
    }
}