import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        // 문자열을 Character 배열로 변환
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        // 내림차순 정렬 (대문자 < 소문자 기준 유지)
        Arrays.sort(chars, Collections.reverseOrder());

        // 결과 문자열로 다시 조립
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }

        return sb.toString();
    }
}
