class Solution {
    public String[] solution(String my_string) {
        // 1. trim()으로 앞뒤 공백을 먼저 깔끔하게 잘라냅니다.
        // 2. split("\\s+")로 하나 이상 연속된 모든 공백을 기준으로 쪼갭니다.
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }
}