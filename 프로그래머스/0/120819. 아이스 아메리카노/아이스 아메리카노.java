class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int ice = 0;
        int charge = 0;
        answer[0] = money / 5500;
        answer[1] = money - (answer[0] * 5500);
        return answer;
    }
}