class Solution {
    public int solution(int n) {
        int answer = 0;
        String tmp = String.valueOf(n);
        char[] charArr = tmp.toCharArray();
        for (char c : charArr) {
            answer += c - '0';
        }
        return answer;
    }
}