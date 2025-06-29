import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> categoryCount = new HashMap<>();

        // 1. 의상 종류별로 개수 세기
        for (String[] cloth : clothes) {
            String type = cloth[1];
            categoryCount.put(type, categoryCount.getOrDefault(type, 0) + 1);
        }

        // 2. 경우의 수 계산: (종류별 옷 개수 + 1) 곱한 후 -1
        int answer = 1;
        for (int count : categoryCount.values()) {
            answer *= (count + 1);  // 안 입는 선택 포함
        }

        return answer - 1;  // 아무것도 안 입는 경우 제외
    }
}
