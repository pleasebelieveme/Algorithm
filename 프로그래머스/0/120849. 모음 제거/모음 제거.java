class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] aeiou = {'a', 'e', 'i', 'o', 'u'};
        char[] charArr = my_string.toCharArray();
        for(char c : charArr) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            }
            else {
                answer += String.valueOf(c);
            }
        }
        return answer;
    }
}