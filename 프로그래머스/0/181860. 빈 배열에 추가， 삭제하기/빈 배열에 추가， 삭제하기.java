import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            
            if (flag[i]) {
                // arr[i]를 arr[i] * 2번 추가
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.add(arr[i]);
                }
            } else {
                // 마지막 arr[i]개 삭제
                for (int j = 0; j < arr[i]; j++) {
                    answer.remove(answer.size() - 1);
                }
            }
        }

        return answer.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}