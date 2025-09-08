class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String sc1 : s1) {
            for (String sc2 : s2) {
                if(sc1.equals(sc2)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}