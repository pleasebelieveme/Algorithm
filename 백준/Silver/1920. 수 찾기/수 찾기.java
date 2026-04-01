import java.util.*;

// 이중 for문은 시간초과
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. N개의 숫자를 입력받아 HashSet에 저장 (중복 제거 및 빠른 검색)
        int N = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }

        // 2. M개의 숫자를 입력받으며 즉시 존재 여부 확인
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder(); // 출력이 많으므로 StringBuilder 사용
        for (int i = 0; i < M; i++) {
            if (set.contains(sc.nextInt())) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}

