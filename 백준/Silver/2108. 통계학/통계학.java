import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 입력 성능 최적화를 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        long sum = 0; // 합계가 int 범위를 넘을 수 있으므로 long 사용

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        // 2. 정렬 (중앙값, 범위, 최빈값 로직의 기초)
        Arrays.sort(arr);

        // --- 계산 시작 ---
        // (1) 산술평균: 반올림 후 int 형변환으로 -0 문제 방지
        int avg = (int)Math.round((double)sum/N);

        // (2) 중앙값: 정렬된 배열의 정중앙 인덱스
        int median = arr[N/2];

        // (3) 최빈값:
        int mode = arr[0];
        int maxCount = 0;
        int currentCount = 0;
        boolean isSecond = false;

        for (int i = 0; i < N; i++) {
            // 연속된 숫자인지 체크
            if (i > 0 && arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            // 최빈값 판별
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mode = arr[i];
                isSecond = false; // 새로운 압도적 최빈값 등장 시 플래그 초기화
            } else if (currentCount == maxCount && !isSecond) {
                mode = arr[i]; // 동일한 빈도 중 두 번째 숫자 발견
                isSecond = true;
            }
        }

        // (4) 범위: 최댓값 - 최솟값
        int range = arr[N-1] - arr[0];

        // 3. 결과 일괄 출력 (I/O 병목 방지)
        StringBuilder sb = new StringBuilder();
        sb.append(avg).append("\n");
        sb.append(median).append("\n");
        sb.append(mode).append("\n");
        sb.append(range).append("\n");

        System.out.print(sb);
    }
}