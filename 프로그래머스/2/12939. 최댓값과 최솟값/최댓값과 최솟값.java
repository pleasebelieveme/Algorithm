import java.util.*;

class Solution {
    public String solution(String s) {
        String[] tmp = s.split(" ");
        int[] num = new int[tmp.length];

        for (int i = 0; i < tmp.length; i++) {
            num[i] = Integer.parseInt(tmp[i]);
        }

        Arrays.sort(num);
        String answer = num[0] + " " + num[tmp.length - 1];
        return answer;
    }
}
