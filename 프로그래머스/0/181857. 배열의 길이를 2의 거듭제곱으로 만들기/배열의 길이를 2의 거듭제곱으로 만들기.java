import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int targetLen = 1;
        
        // arr.length보다 크거나 같은 가장 작은 2의 거듭제곱 구하기
        while (targetLen<arr.length) {
            targetLen *= 2;
        }
        
        // 구한 targetLen 크기로 배열을 복사 (새로 생긴 남은 공간은 0으로 자동 채워짐)
        return Arrays.copyOf(arr, targetLen);
    }
}