class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    if (j * j == i) cnt++;
                    else cnt += 2;
                }
            }
            if (cnt > limit) answer += power;
            else answer += cnt;
        }

        return answer;
    }
}

/*
// i의 약수를 구한게 아니라 sqrt의 약수의 갯수를 구했음
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        
        for(int i = 1; i <= number; i++){
            int cnt = 0;
            int sqrt = (int) Math.sqrt(i);
            for (int j = 1; j <= sqrt; j++) {
                if(sqrt % j == 0 || sqrt / j != j) cnt++;
            }
            if (cnt >= limit) answer += cnt;
            else answer += power;
        }
        return answer;
    }
}
*/