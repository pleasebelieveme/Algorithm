class Solution {
    public int[] solution(int[] emergency) {

        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {

            // 현재 응급도보다 높은 응급도를 가진 환자의 수
            int rank = 1;

            for (int j = 0; j < emergency.length; j++) {

                if (emergency[i] < emergency[j]) {
                    rank++;
                }
            }

            answer[i] = rank;
        }

        return answer;
    }
}