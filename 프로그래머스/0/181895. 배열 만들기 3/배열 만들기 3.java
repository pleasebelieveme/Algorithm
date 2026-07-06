import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        for (int i = start1; i <= end1; i++) {
            list.add(arr[i]);
        }
        
        int start2 = intervals[1][0];
        int end2 = intervals[1][1];
        for (int i = start2; i <= end2; i++) {
            list.add(arr[i]);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}