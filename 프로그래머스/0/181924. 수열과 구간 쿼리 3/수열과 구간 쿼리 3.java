class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        for (int[] query : queries) {
            int tmp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = tmp;
        }

        answer = arr;
        return answer;
    }
}