class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 1. 각 쿼리를 순서대로 처리
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            // 2. s부터 e까지 인덱스에 대해 arr[i] 값을 1씩 증가
            for (int i = s; i <= e; i++) {
                arr[i]++;
            }
        }
        
        return arr;
    }
}