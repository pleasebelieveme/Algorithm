import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 모두를 생존자(false)로 보고, 탈락자(true)를 하나씩 소거한 뒤, 끝까지 살아남은 생존자만 출력한다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        // N+1 크기의 비트 세트 생성 (처음엔 모든 비트가 0/false)
        BitSet isNotPrime = new BitSet(N + 1);
        
        // 0과 1은 소수가 아니므로 비트를 켭니다(true)
        isNotPrime.set(0);
        isNotPrime.set(1);
        
        for (int i = 2; i * i <= N; i++) {
            // get(i)가 false라면 (아직 안 지워진 소수라면)
            if (!isNotPrime.get(i)) {
                // i*i부터 N까지 i씩 건너뛰며 비트를 켭니다(true)
                for (int j = i * i; j <= N; j += i) {
                    isNotPrime.set(j);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        // M부터 N까지 비트가 꺼져 있는(nextClearBit) 인덱스만 출력
        for (int i = isNotPrime.nextClearBit(M); i <= N; i = isNotPrime.nextClearBit(i + 1)) {
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}