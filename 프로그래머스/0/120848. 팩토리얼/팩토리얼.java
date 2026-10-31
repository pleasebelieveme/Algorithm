class Solution {
    public int solution(int n) {
        int i = 1;
        int fact = 1;
        
        // 다음 i+1을 곱했을 때 n을 넘지 않는 동안 반복합니다.
        while (fact*(i+1) <= n) {
            i++;
            fact *= i;
        }
        
        return i;
    }
}