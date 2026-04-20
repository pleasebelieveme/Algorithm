import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        
        int count = 0;
        
        // 가장 큰 동전부터 확인해야 하므로 역순으로 루프
        // A1 = 1이라는 조건은 1짜리 동전이 무조건 있다는 뜻
        for (int i = N - 1; i >= 0; i--) {
            if (coins[i] <= K) {
                count += K / coins[i]; // 동전 개수 추가
                K %= coins[i];         // 남은 금액 업데이트
            }
            
            // K가 0이 되면 더 이상 계산할 필요 없음 (Early Exit)
            if (K == 0) break;
        }
        
        System.out.println(count);
    }
}