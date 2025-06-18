class Solution {
    public int solution(String word) {
        String[] vowels = {"A", "E", "I", "O", "U"};
        // 각 자릿수에서 가능한 경우 수
        // 5⁴ + 5³ + 5² + 5¹ + 1
        int[] weights = {781, 156, 31, 6, 1};
        int answer = 0;

        for (int i = 0; i < word.length(); i++) {
            int index = "AEIOU".indexOf(word.charAt(i));
            answer += index * weights[i] + 1;
        }

        return answer;
    }
}
