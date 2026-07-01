class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int tmp = 0;
        for(int i : numbers) {
            tmp += i;
            if(tmp>n) {
                answer = tmp;
                break;
            }
        }
        return answer;
    }
}