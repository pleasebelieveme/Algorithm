import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> countX = new HashMap<>();
        Map<Character, Integer> countY = new HashMap<>();

        for (char c : X.toCharArray()) {
            countX.put(c, countX.getOrDefault(c, 0) + 1);
        }

        for (char c : Y.toCharArray()) {
            countY.put(c, countY.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        // 큰 수부터 채워야 하므로 9부터 0까지 반복
        for (char c = '9'; c >= '0'; c--) {
            int count = Math.min(countX.getOrDefault(c, 0), countY.getOrDefault(c, 0));
            for (int i = 0; i < count; i++) {
                sb.append(c);
            }
        }

        if (sb.length() == 0) {
            return "-1";
        }

        // 모두 0으로 구성된 경우
        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}
