import java.util.*;

public class Solution {
    public int solution(int[] topping) {
        Map<Integer, Integer> rightMap = new HashMap<>();
        Set<Integer> leftSet = new HashSet<>();

        for (int t : topping) {
            rightMap.put(t, rightMap.getOrDefault(t, 0) + 1);
        }

        int answer = 0;

        for (int i = 0; i < topping.length - 1; i++) {
            int current = topping[i];
            
            // 왼쪽에 추가
            leftSet.add(current);

            // 오른쪽에서 제거
            rightMap.put(current, rightMap.get(current) - 1);
            if (rightMap.get(current) == 0) {
                rightMap.remove(current);
            }

            // 토핑 종류 수가 같으면 count
            if (leftSet.size() == rightMap.size()) {
                answer++;
            }
        }

        return answer;
    }
}
