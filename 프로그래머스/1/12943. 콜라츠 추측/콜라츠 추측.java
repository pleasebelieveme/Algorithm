class Solution {
    public int solution(int num) {
        int answer = 1;
        int count = 0;
        while(count<501) {
            if(num==1) break;
            if(num%2==0) {
                num /= 2;
            }
            else if(num%2==1){
                num = (num*3)+1;
            }
            count++;
        }
        if (count==501) answer = -1;
        else answer = count;
        return answer;
    }
}