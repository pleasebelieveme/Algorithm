import java.util.*;

public class Solution {
    public static int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            answer[i] = map.getOrDefault(c, -1)==-1 ? -1 : i - map.get(c);
            map.put(c, i);
        }

        return answer;
    }
}
