import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int matchCnt = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) zeroCnt++;
            else {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        matchCnt++;
                        break;
                    }
                }
            }
        }
        int maxMatch = matchCnt + zeroCnt;
        int minMatch = matchCnt;
        int maxRank = (maxMatch >= 2) ? 7 - maxMatch : 6;
        int minRank = (minMatch >= 2) ? 7 - minMatch : 6;
        
        answer[0] = maxRank;
        answer[1] = minRank;
        return answer;
    }
}
