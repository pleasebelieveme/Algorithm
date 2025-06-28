import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        
        // 문자별 최소 클릭 수 저장
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                // 기존 값보다 적은 클릭 수라면 갱신
                map.put(c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE), i + 1));
            }
        }

        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (char c : targets[i].toCharArray()) {
                if (map.containsKey(c)) {
                    sum += map.get(c);
                } else {
                    // 못 만드는 경우 -1 저장하고 종료
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}
