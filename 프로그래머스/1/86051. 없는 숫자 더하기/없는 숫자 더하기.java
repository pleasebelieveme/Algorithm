class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int i=0; i<numbers.length; i++){
            for (int j=1; j<10; j++) {
                if(numbers[i] == j) answer -= j;
            }
        }
        return answer;
    }
}