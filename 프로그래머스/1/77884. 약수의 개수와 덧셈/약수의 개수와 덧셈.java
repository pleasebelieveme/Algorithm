class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        for (int i=0; i<=right-left; i++){
            for (int j = 1; j <= Math.sqrt(left+i); j++) {
                if ((left+i) % j == 0) {
                    count++;
                    if (j != (left+i) / j) count++;
                }
            }         
            if(count%2==1) answer -= (left+i);
            else answer += (left+i);
            count=0;
        }
        
        return answer;
    }
}