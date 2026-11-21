class Solution {
    public int solution(String my_string) {

        int answer = 0;
        int number = 0;

        for (char c : my_string.toCharArray()) {

            // 현재 문자가 숫자인 경우
            if (Character.isDigit(c)) {

                // 여러 자리 숫자를 만들기
                number = number * 10 + (c - '0');

            } else {

                // 숫자가 끝났으므로 지금까지 만든 숫자를 더하기
                answer += number;

                // 다음 숫자를 만들 준비
                number = 0;
            }
        }

        // 문자열이 숫자로 끝나는 경우 마지막 숫자 처리
        answer += number;

        return answer;
    }
}