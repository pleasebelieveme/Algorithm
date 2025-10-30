class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        int square = 0;
        for(int i : num_list) {
            multiple *= i;
            square += i;
        }
        square *= square;

        if(multiple < square) {
            answer = 1;
        }
        return answer;
    }
}