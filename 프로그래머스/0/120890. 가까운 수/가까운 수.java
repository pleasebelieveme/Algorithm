class Solution {
    public int solution(int[] array, int n) {

        // 일단 첫 번째 숫자를 가장 가까운 숫자라고 가정
        int answer = array[0];

        // 두 번째 숫자부터 비교
        for (int i=1; i<array.length; i++) {

            // 현재 숫자가 더 가까운 경우
            if (Math.abs(array[i]-n) < Math.abs(answer-n)) {
                answer = array[i];

            // 거리가 같다면 더 작은 숫자를 선택
            } else if (Math.abs(array[i]-n) == Math.abs(answer-n) && array[i]<answer) {
                answer = array[i];
            }
        }

        return answer;
    }
}