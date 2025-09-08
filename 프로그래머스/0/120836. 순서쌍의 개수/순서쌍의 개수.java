class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 약수갯수 찾기
        for (int i = 1; i*i <= n; i++) {
            if (n%i == 0) {
                if (i*i == n) {
                    answer += 1; // (i, i)인 경우 (중복 X)
                } else {
                    answer += 2; // (i, n/i), (n/i, i) 두 가지 순서쌍
                }
            }
        }
        
        return answer;
    }
}