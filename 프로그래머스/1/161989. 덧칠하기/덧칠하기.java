// 그리디 + 점프 알고리즘
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int index = 0;

        while (index < section.length) {
            int start = section[index];
            int end = start + m - 1;
            answer++;

            // 이번 롤러로 커버 가능한 구간 내 section[]은 패스
            while (index < section.length && section[index] <= end) {
                index++;
            }
        }

        return answer;
    }
}
