import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 데이터가 많으므로 Scanner보다 BufferedReader가 훨씬 빠릅니다!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 이미 있으면 기존 값 + 1, 없으면 0 + 1 (getOrDefault 활용)
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            int findNum = Integer.parseInt(st.nextToken());
            // 맵에서 찾아서 개수 반환, 없으면 0
            sb.append(map.getOrDefault(findNum, 0)).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}