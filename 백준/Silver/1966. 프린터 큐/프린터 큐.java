import java.util.*;
import java.io.*;

public class Main {
    // 문서의 '처음 위치'와 '중요도'를 묶어서 관리합니다.
    static class Document {
        int initialPos;
        int priority;

        Document(int initialPos, int priority) {
            this.initialPos = initialPos;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine());

        while (testCaseCount-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 문서 개수
            int M = Integer.parseInt(st.nextToken()); // 타겟 위치

            LinkedList<Document> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            // 1. 데이터를 큐에 삽입
            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new Document(i, priority));
            }

            int printOrder = 0; // 인쇄된 순서 카운트

            // 2. 출력 로직 시작
            while (!queue.isEmpty()) {
                Document current = queue.poll(); // 일단 맨 앞 문서를 꺼냄
                boolean hasHigherPriority = false;

                // 현재 문서보다 중요도가 높은 문서가 있는지 검사
                for (Document doc : queue) {
                    if (doc.priority > current.priority) {
                        hasHigherPriority = true;
                        break;
                    }
                }

                // [Case 1] 뒤에 더 중요한 문서가 있는 경우 -> 다시 뒤로 보냄
                if (hasHigherPriority) {
                    queue.offer(current);
                    continue; // 이번 턴은 여기서 종료하고 다음 반복으로!
                }

                // [Case 2] 내가 가장 중요한 경우 -> 인쇄 확정
                printOrder++;

                // 만약 인쇄된 문서가 우리가 찾던 그 문서(M)라면 결과 출력 후 종료
                if (current.initialPos == M) {
                    System.out.println(printOrder);
                    break;
                }
            }
        }
    }
}