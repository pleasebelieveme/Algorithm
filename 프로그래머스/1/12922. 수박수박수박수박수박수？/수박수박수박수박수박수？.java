class Solution {
    public String solution(int n) {
        String answer = "";
        String[] str = {"수", "박"};
        for (int i=0; i<n; i++) {
            answer += str[i%2];
        }
        return answer;
    }
}