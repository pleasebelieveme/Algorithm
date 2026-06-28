import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int arrI : arr) {
            boolean shouldDelete = false;
            
            for (int arrD : delete_list) {
                if (arrI == arrD) {
                    shouldDelete = true;
                    break;
                }
            }
            
            if (!shouldDelete) {
                list.add(arrI);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}