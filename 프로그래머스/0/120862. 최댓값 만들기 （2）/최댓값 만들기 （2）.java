import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 1. 오름차순으로 정렬
        Arrays.sort(numbers);
        
        int n = numbers.length;
        
        // 2. 맨 뒤 두 수의 곱(양수 최대) vs 맨 앞 두 수의 곱(음수 최대) 비교
        int case1 = numbers[n - 1] * numbers[n - 2];
        int case2 = numbers[0] * numbers[1];
        
        // 3. 더 큰 값을 반환
        return Math.max(case1, case2);
    }
}