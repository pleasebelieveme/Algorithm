import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        while (true) {

            // 변환하기 전 배열을 복사
            int[] tmpArr = arr.clone();

            // 배열의 각 원소를 조건에 따라 변환
            for (int i=0; i<arr.length; i++) {

                // 50보다 작고 홀수
                if (arr[i]<50 && arr[i]%2==1) {
                    arr[i] = (arr[i]*2)+1;

                // 50 이상이고 짝수
                } else if (arr[i]>=50 && arr[i]%2==0) {
                    arr[i] = arr[i]/2;
                }
            }

            // 변환 전과 후가 같다면 더 이상 변하지 않음
            if (Arrays.equals(tmpArr, arr)) {
                break;
            }

            // 배열이 변했으므로 반복 횟수 증가
            answer++;
        }

        return answer;
    }
}