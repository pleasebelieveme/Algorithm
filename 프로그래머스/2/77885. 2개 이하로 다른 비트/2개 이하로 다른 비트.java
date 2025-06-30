class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long n = numbers[i];

            // 짝수면 바로 +1
            if (n % 2 == 0) {
                answer[i] = n + 1;
            } else {
                // 홀수면 가장 낮은 0비트를 1로, 그 다음 1을 0으로 바꾸는 방식
                long bit = 1L;
                while ((n & bit) != 0) {
                    bit <<= 1;
                }
                // 해당 비트를 1로, 그 직전 비트를 0으로 바꾼 값
                answer[i] = n + bit - (bit >> 1);
            }
        }

        return answer;
    }
}
