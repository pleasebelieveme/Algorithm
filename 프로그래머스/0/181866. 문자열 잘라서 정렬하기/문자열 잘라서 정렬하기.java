import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))  // 1. x로 쪼개어 스트림 오픈
                     .filter(str -> !str.isEmpty()) // 2. 빈 문자열("")이 아닌 것만 필터링
                     .sorted()                     // 3. 사전순으로 정렬(sorted)
                     .toArray(String[]::new);      // 4. 결과를 곧바로 String[] 배열로 변환
    }
}