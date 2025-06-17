import java.util.TreeSet;

class Solution {
    public TreeSet<Integer> solution(int[] numbers) {
        int[] answer = {};
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                treeSet.add(numbers[i] + numbers[j]);
            }
        }
        return treeSet;
    }
}

    

