import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1; // 시작 인덱스 (배열은 0부터 시작)
            int end = commands[i][1];       // 끝 인덱스 + 1
            int k = commands[i][2] - 1;     // k번째 숫자는 0부터 시작

            int[] tmp = Arrays.copyOfRange(array, start, end); // 배열 자르기
            Arrays.sort(tmp); // 정렬
            answer[i] = tmp[k]; // k번째 숫자 저장
        }

        return answer;
    }
}
