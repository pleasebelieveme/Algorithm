class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (char c : s.toCharArray()) {
            if ((int)c == 32) {
                answer += " ";
            } else if (Character.isUpperCase(c)) {
                if ((int)(c + n) > 90) {
                    answer += String.valueOf((char)(c + n - 26));
                }
                else answer += String.valueOf((char)(c + n));
            } else if (Character.isLowerCase(c)) { 
                if ((int)(c + n) > 122) {
                    answer += String.valueOf((char)(c + n - 26));
                }
                else answer += String.valueOf((char)(c + n));
            }
        }
        
        return answer;
    }
}
