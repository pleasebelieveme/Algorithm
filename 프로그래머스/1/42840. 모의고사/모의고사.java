import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scores = new int[3]; // 각 수포자의 점수 저장
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i % num1.length]) scores[0]++;
            if (answers[i] == num2[i % num2.length]) scores[1]++;
            if (answers[i] == num3[i % num3.length]) scores[2]++;
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            if (scores[i] == maxScore) result.add(i + 1); // 1번, 2번, 3번 수포자 (인덱스 + 1)
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}
