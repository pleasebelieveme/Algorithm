import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1)); // cards1을 큐로 변환
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2)); // cards2를 큐로 변환
        
        for (String word : goal) {
            if (!queue1.isEmpty() && queue1.peek().equals(word)) {
                queue1.poll(); // cards1에서 단어 꺼냄
            } else if (!queue2.isEmpty() && queue2.peek().equals(word)) {
                queue2.poll(); // cards2에서 단어 꺼냄
            } else {
                return answer = "No"; // 단어를 꺼낼 수 없으면 실패
            }
        }
        return answer; // 모든 단어를 순서대로 꺼냈다면 성공
    }
}
