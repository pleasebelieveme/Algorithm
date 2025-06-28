class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] status = new int[n + 1]; // 1번부터 n번 학생 관리

        // 여벌 체육복 표시
        for (int r : reserve) status[r] += 1;

        // 도난 표시
        for (int l : lost) status[l] -= 1;

        // 체육복 빌려주기
        for (int i = 1; i <= n; i++) {
            if (status[i] == -1) { // 체육복이 없는 경우
                if (i > 1 && status[i - 1] == 1) {
                    status[i]++;
                    status[i - 1]--;
                } else if (i < n && status[i + 1] == 1) {
                    status[i]++;
                    status[i + 1]--;
                }
            }
        }

        // 체육복 있는 학생 수 계산
        for (int i = 1; i <= n; i++) if (status[i] >= 0) answer++;

        return answer;
    }
}
