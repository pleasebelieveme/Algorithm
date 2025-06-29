import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // 1. 크기별 개수 세기
        for (int t : tangerine) {
            countMap.put(t, countMap.getOrDefault(t, 0) + 1);
        }

        // 2. 개수를 내림차순 정렬
        List<Integer> counts = new ArrayList<>(countMap.values());
        counts.sort(Collections.reverseOrder());

        // 3. k개를 채울 때까지 종류 세기
        int result = 0;
        int sum = 0;
        for (int c : counts) {
            sum += c;
            result++;
            if (sum >= k) break;
        }

        return result;
    }
}