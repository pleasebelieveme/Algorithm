// 2차원 배열을 만들면 시간초과
class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right - left + 1);
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            long index = left + i;
            int row = (int)(index / n);
            int col = (int)(index % n);
            answer[i] = Math.max(row, col) + 1;
        }

        return answer;
    }
}
