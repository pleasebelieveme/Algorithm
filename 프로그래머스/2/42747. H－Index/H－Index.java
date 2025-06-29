import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 오름차순 정렬
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int h = n - i; // 현재 논문 수 중 인용 횟수가 h 이상인 논문 개수
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }
}
