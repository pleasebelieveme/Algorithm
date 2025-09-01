class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        for (int i = 0; i < my_string.length(); i++) {
            if(String.valueOf(charArr[i]).equals(letter)) {
                continue;
            } else {
                answer += charArr[i];
            }
        }
        return answer;
    }
}