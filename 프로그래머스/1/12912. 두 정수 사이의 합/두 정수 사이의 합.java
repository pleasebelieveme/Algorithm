class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int tmp = 0;
        // 작은 숫자가 a에 입력되도록 치환
        if(a>b) {
            tmp = a;
            a=b;
            b=tmp;
        }
        for (int i=a; i<=b; i++) {
            answer += i;
        }
        return answer;
    }
}