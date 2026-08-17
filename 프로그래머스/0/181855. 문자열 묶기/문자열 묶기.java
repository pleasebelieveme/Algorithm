class Solution {
    public int solution(String[] strArr) {
        // 문자열 길이는 최대 30이므로 인덱스 30까지 담을 수 있는 배열 생성
        int[] lenCount = new int[31];
        int max = 0;

        for (String str : strArr) {
            int len = str.length();
            lenCount[len]++;
            
            // 실시간으로 가장 많은 그룹의 크기를 갱신
            if (lenCount[len] > max) {
                max = lenCount[len];
            }
        }

        return max;
    }
}