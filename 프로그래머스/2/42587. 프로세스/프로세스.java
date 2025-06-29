import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        
        // 큐에 [인덱스, 우선순위] 형태로 삽입
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {i, priorities[i]});
        }
        
        int order = 0;  // 몇 번째로 실행되는지 카운터

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigher = false;

            // 현재 프로세스보다 우선순위 높은 게 뒤에 있는지 확인
            for (int[] q : queue) {
                if (q[1] > current[1]) {
                    hasHigher = true;
                    break;
                }
            }

            if (hasHigher) {
                // 다시 큐에 넣음
                queue.add(current);
            } else {
                // 실행
                order++;
                if (current[0] == location) {
                    return order;
                }
            }
        }

        return -1; // 이론상 도달할 수 없음
    }
}
