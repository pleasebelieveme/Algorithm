class Solution {
    public int solution(int n) {
        int answer = 0;

        // 1. 합성수는 최소 4부터 시작하므로 4부터 n까지 확인합니다.
        for (int i=4; i<=n; i++) {
            int count = 0; // 약수의 개수를 세는 변수

            // 2. 1부터 i까지 나누어떨어지는지 확인하여 약수의 개수를 셉니다.
            // 조건이 1<=n<=100이기에 Math.qurt()안써도 통과
            for (int j=1; j<=i; j++) {
                if (i%j == 0) {
                    count++;
                }
            }

            // 3. 약수가 3개 이상이면 합성수이므로 카운트 증가!
            if (count >= 3) {
                answer++;
            }
        }

        return answer;
    }
}