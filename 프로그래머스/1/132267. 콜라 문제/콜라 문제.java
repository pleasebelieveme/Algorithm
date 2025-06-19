class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {  // a개 이상 있어야 교환 가능
            int newCola = (n / a) * b;  // 새로 받는 콜라 병 개수
            int restBottle = n % a;  // 남는 병 개수
            n = newCola + restBottle;  // 새로운 병 개수 업데이트
            answer += newCola;  // 받은 콜라 개수 누적
        }

        return answer;
    }
}
