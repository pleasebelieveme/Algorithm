import java.util.*;

public class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(new int[]{x, 0});
        visited.add(x);

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int value = current[0];
            int steps = current[1];

            if (value == y) {
                return steps;
            }

            // 가능한 연산 세 가지
            int[] nextValues = {value + n, value * 2, value * 3};

            for (int next : nextValues) {
                if (next <= y && !visited.contains(next)) {
                    visited.add(next);
                    queue.add(new int[]{next, steps + 1});
                }
            }
        }

        return -1; // 도달할 수 없는 경우
    }
}
