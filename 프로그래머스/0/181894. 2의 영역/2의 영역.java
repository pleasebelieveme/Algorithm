class Solution {
    public int[] solution(int[] arr) {

        int firstIndex = -1;
        int lastIndex = -1;

        // 첫 번째 2와 마지막 2의 인덱스 찾기
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 2) {

                // 처음 발견한 2의 위치 저장
                if (firstIndex == -1) {
                    firstIndex = i;
                }

                // 발견할 때마다 마지막 위치로 갱신
                lastIndex = i;
            }
        }

        // 2가 없는 경우
        if (firstIndex == -1) {
            return new int[]{-1};
        }

        // 첫 번째 2부터 마지막 2까지의 길이
        int[] answer = new int[lastIndex - firstIndex + 1];

        // 부분 배열 만들기
        for (int i = firstIndex; i <= lastIndex; i++) {
            answer[i - firstIndex] = arr[i];
        }

        return answer;
    }
}