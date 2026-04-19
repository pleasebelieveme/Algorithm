import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 1. 듣도 못한 사람을 저장할 공간 (빠른 검색을 위해 Set 활용)
        HashSet<String> unheard = new HashSet<>();
        for (int i = 0; i < N; i++) {
            unheard.add(br.readLine());
        }

        // 2. 보도 못한 사람을 읽으며 교집합 찾기
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (unheard.contains(name)) {
                result.add(name);
            }
        }

        // 3. 사전순 정렬 (백엔드 리스트 정렬의 정석)
        Collections.sort(result);

        // 4. 출력 최적화(println을 계속 호출하는 것보다 buffer에 모아 한번에 출력하는 것이 효율적)
        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append("\n");
        for (String name : result) {
            sb.append(name).append("\n");
        }
        System.out.print(sb);
    }
}