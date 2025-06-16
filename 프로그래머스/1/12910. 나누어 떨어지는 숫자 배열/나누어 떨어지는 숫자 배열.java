import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            if(i%divisor==0) {
                answer.add(i);
            }
        }
        if(answer.isEmpty()) answer.add(-1);
        else answer.sort(null);
        return answer;
    }
}