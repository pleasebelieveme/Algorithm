class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int tmp = 0;
        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    tmp = nums[i] + nums[j] + nums[k];
                    boolean isPrime = true;
                    for (int l = 2; l <= (int) Math.sqrt(tmp); l++) {
                        if (tmp % l == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) answer++;
                }
            }
        }
        
        return answer;
    }
}