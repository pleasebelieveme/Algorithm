class Solution {
    public int solution(String s) {
    int answer = 0;
    int i = 0;
    while (i < s.length()) {
        char x = s.charAt(i);
        int xCnt = 0;
        int yCnt = 0;
        while (i < s.length()) {
            if (s.charAt(i) == x) xCnt++;
            else yCnt++;
            i++;
            if (xCnt == yCnt) break;
        }
        answer++;
    }
    return answer;
    }
}