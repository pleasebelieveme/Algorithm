import java.util.Arrays;

class Solution {
    public String solution(String s) {

        // 1. 각 문자의 등장 횟수를 저장
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // 2. 한 번만 등장한 문자들을 저장
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                answer.append((char) (i + 'a'));
            }
        }

        // 이미 a부터 z 순서대로 확인했기 때문에 정렬된 상태
        return answer.toString();
    }
}