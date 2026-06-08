class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;

        if (target.length() > my_string.length()) {
            return 0;
        }        
        for (int i=0; i<my_string.length()-target.length()+1; i++) {
            String sub = my_string.substring(i, i+target.length());
            if (sub.equals(target)) {
                return answer = 1;
            }
        }
        
        return answer;
    }
}