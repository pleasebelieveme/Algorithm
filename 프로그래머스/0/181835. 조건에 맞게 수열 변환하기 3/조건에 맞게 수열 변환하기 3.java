class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int idx = 0;
        if(k%2 == 1) {
            for(int i : arr) {
                answer[idx] = i*k;
                idx++;
            }
        } else {
            for(int i : arr) {
                answer[idx] = i+k;
                idx++;
            }
        }
        return answer;
    }
}