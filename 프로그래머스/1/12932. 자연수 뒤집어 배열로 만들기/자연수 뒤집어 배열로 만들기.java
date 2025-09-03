class Solution {
    public int[] solution(long n) {
        char[] c = String.valueOf(n).toCharArray();
        int length = String.valueOf(n).length();
        int[] answer = new int[length];
        for (int i=0; i<length; i++){
            answer[i] = c[length-1-i]-48;
        }
        return answer;
    }
}