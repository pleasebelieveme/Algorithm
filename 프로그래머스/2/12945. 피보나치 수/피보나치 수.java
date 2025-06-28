class Solution {
    public int solution(int n) {
        int num = 0;           // 이전 피보나치 항 (F(n-2))
        int answer = 1;        // 현재 피보나치 항 (F(n-1)), 초기값은 F(1)
        int count = 1;         // 현재 항의 번호 (1부터 시작)

        while(count < n){      // 원하는 항(n)에 도달할 때까지 반복
            int num1 = num;    // 이전 값을 임시 저장
            num = answer;      // 현재 값을 이전 값으로 이동
            answer = (num1 + answer) % 1234567; // 다음 피보나치 항 계산 (모듈로 연산으로 오버플로우 방지)
            count++;           // 항 번호 증가
        }

        return answer;         // n번째 피보나치 수 리턴
    }
}
