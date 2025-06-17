import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) == s2.charAt(n)) { // 같은 문자면 사전순 정렬
                return s1.compareTo(s2);
            }
            return Character.compare(s1.charAt(n), s2.charAt(n)); // 문자 기준 정렬
        });

        return strings;
    }
}
