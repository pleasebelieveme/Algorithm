import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length == 1) {
            list.add(-1);
            return list;
        }
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min) {
                continue;
            }
            else {
                list.add(arr[i]);
            }
        }
        return list;
    }
}