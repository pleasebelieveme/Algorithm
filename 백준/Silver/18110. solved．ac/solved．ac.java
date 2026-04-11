import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 1. 의견이 없는 경우 처리
        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        // 2. 정렬 (절사평균을 위해 필수)
        Arrays.sort(scores);

        // 3. 제외할 인원 계산 (15% 반올림)
        int cut = (int) Math.round(n * 0.15);

        // 4. 남은 점수들의 합계 계산
        double sum = 0;
        for (int i = cut; i < n - cut; i++) {
            sum += scores[i];
        }

        // 5. 평균 계산 및 반올림 출력
        // (전체 개수 n에서 위아래 cut만큼 뺀 인원수로 나눔)
        int remainingCount = n - (2 * cut);
        System.out.println(Math.round(sum / remainingCount));
    }
}