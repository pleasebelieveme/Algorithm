import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> days = new LinkedList<>();

        // 각 기능마다 완료까지 필요한 '일수'를 큐에 담음
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int day = (int) Math.ceil((double) remain / speeds[i]);
            days.offer(day);
        }

        while (!days.isEmpty()) {
            int current = days.poll();
            int count = 1;

            // 현재 작업 완료일보다 작거나 같은 작업들을 함께 배포
            while (!days.isEmpty() && days.peek() <= current) {
                days.poll();
                count++;
            }

            answer.add(count);
        }

        // List → int[]
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
