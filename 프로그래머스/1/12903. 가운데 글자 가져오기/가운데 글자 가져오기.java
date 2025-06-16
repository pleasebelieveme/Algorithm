class Solution {
    public String solution(String s) {
        String answer = "";
        char[] cArr = s.toCharArray();
        int idx = 0;
        if(s.length()%2==1) {
            idx = s.length()/2;
            answer = String.valueOf(cArr[idx]);
        }
        else {
            idx = s.length()/2;
            answer = String.valueOf(cArr[idx-1]);
            answer += String.valueOf(cArr[idx]);
        }
        return answer;
    }
}