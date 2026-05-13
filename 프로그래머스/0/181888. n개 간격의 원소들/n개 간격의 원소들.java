class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = (num_list.length+n-1) / n;
        int[] answer = new int[size];
        int index = 0;
        
        for (int i = 0; i < num_list.length; i += n) {
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}