class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String strNum = String.valueOf(num);        
        int index = strNum.indexOf(String.valueOf(k));
        answer = (index == -1) ? -1 : index + 1;
        return answer;
    }
}