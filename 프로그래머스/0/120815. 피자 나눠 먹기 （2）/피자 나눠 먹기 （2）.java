class Solution {
    public int solution(int n) {
        int pizza = 1;
        
        // 총 조각 수(pizza * 6)가 사람 수(n)로 나누어 떨어지지 않으면 판 수를 늘립니다.
        while ((pizza * 6) % n != 0) {
            pizza++;
        }
        
        return pizza;
    }
}