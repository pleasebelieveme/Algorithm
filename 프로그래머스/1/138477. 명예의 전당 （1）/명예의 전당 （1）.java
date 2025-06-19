import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> stage = new PriorityQueue<>(); // 최소값으로 자동정렬
        for (int i=0; i<score.length; i++) {
            stage.add(score[i]);
            if(stage.size()>k) {
                stage.poll();
            }
            answer[i] = stage.peek();
        }
        return answer;
    }
}