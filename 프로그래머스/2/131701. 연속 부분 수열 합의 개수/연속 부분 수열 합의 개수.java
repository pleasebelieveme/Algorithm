import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int n = elements.length;

        // 배열 두 번 이어붙이기
        int[] doubleArr = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            doubleArr[i] = elements[i % n];
        }

        // 길이 1부터 n까지 슬라이딩 윈도우
        for (int len = 1; len <= n; len++) {
            int sum = 0;

            // 첫 윈도우 합 구하기
            for (int i = 0; i < len; i++) {
                sum += doubleArr[i];
            }
            set.add(sum);

            // 슬라이딩 시작
            for (int i = len; i < n + len - 1; i++) {
                sum = sum - doubleArr[i - len] + doubleArr[i];
                set.add(sum);
            }
        }

        return set.size();
    }
}
