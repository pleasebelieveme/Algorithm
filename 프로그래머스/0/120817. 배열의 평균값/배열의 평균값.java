class Solution {
    public double solution(int[] numbers) {
        int add = 0;
        for (int i = 0; i<numbers.length; i++) {
            add = add + numbers[i];
        }
        double answer = (double)add / numbers.length;
        
        return answer;
    }
}