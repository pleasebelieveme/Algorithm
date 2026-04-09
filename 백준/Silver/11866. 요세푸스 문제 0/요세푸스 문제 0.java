import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // FIFO 구조가 필요한 요세푸스 문제는 큐(Deque) 사용
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!queue.isEmpty()) {
            // K-1번 동안 맨 앞의 숫자를 꺼내서 뒤로 다시 넣기
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }

            // K번째 숫자는 영구적으로 제거하며 결과에 추가
            sb.append(queue.poll());

            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        
        System.out.println(sb.toString());
    }
}