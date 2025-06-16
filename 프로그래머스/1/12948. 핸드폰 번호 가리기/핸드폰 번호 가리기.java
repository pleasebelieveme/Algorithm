class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int tmp = phone_number.length()-4;
        for (int i=0; i<tmp; i++) {
            answer += "*";
        }
        String four = phone_number.substring(tmp);
        answer += four;
        return answer;
    }
}