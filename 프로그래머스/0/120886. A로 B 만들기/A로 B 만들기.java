import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        // 문자열을 char 배열로 변환
        char[] beforeChars = before.toCharArray();
        char[] afterChars = after.toCharArray();
        
        // 각각 정렬
        Arrays.sort(beforeChars);
        Arrays.sort(afterChars);
        
        // 정렬된 배열이 서로 같으면 1, 다르면 0 반환
        return Arrays.equals(beforeChars, afterChars) ? 1 : 0;
    }
}